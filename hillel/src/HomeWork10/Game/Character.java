package HomeWork10.Game;

import java.io.*;
import java.util.Random;

/**
 * Created by user on 01.12.2015.
 */
public abstract class Character extends Thread implements Serializable {
    private Weapon weapon;
    private Damage damage;
    private int health = 50;
    private Character enemy;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public void setEnemy(Character enemy) {
        this.enemy = enemy;
    }

    public int getCuttingDamage() {
        return damage.getCuttingDamage();
    }

    public int getCrushingDamage() {
        return damage.getCrushingDamage();
    }

    public int getPiercingDamage() {
        return damage.getPiercingDamage();
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void saveCharacter() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\user\\Desktop\\save.dat"))) {
            outputStream.writeObject(this);
            outputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Character loadCharacter() {
        Character character = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\save.dat"))) {
            character = (Character) inputStream.readObject();
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return character;
    }

    public static Character createCharacter() {
        Random random = new Random();
        int ch = random.nextInt(3);
        Character character = null;
        switch (ch) {
            case 0:
                character = new Elf();
                break;
            case 1:
                character = new Human();
                break;
            case 2:
                character = new Orc();
                break;
        }
        return character;
    }

    public int totalDamage() {
        int cut = this.getCuttingDamage() + this.weapon.getCuttingDamage();
        int crush = this.getCrushingDamage() + this.weapon.getCrushingDamage();
        int pierce = this.getPiercingDamage() + this.weapon.getPiercingDamage();

        int[] ints = {cut, crush, pierce};
        int max = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        }

        int totalDamage;
        if (cut < max && cut > 0) {
            totalDamage = max + cut / 2;
        } else if (crush < max && crush > 0) {
            totalDamage = max + crush / 2;
        } else if (pierce < max && pierce > 0) {
            totalDamage = max + pierce / 2;
        } else {
            totalDamage = max;
        }
        return totalDamage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

                if (this.getHealth() > 0 && enemy.getHealth() > 0) {
                    int newHealth = this.getHealth() - enemy.totalDamage();
                    if (newHealth >= 0) {
                        this.setHealth(newHealth);
                    } else {
                        this.setHealth(0);
                    }
                    System.out.println(this.display() + " health is " + this.getHealth());
                } else break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (this.getHealth() > enemy.getHealth()) {
            System.out.println(this.display() + " has won!");
        }
    }

    abstract String display();
}
