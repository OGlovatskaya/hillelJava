package HomeWork10.Game;

import java.io.*;
import java.util.Random;

/**
 * Created by user on 01.12.2015.
 */
public abstract class Character implements Serializable {
    private Weapon weapon;
    private Damage damage;
    private int health = 50;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
        damage.setCharacter(this);
    }

    public Damage getDamage(){
        return this.damage;
    }

    public void setHealth(int health) {
        this.health = health;
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
        return damage.totalDamage();
    }

    abstract String display();
}
