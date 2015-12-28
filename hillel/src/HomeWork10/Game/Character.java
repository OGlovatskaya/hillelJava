package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public abstract class Character extends Thread {
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

    public int getCuttingDamage() {
        return damage.getCuttingDamage();
    }

    public int getCrushingDamage() {
        return damage.getCrushingDamage();
    }

    public int getPiercingDamage() {
        return damage.getPiercingDamage();
    }

    public void setEnemy(Character enemy) {
        this.enemy = enemy;
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
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
                        System.out.println(this.display() + " health is " + this.getHealth());
                    } else {
                        this.setHealth(0);
                        System.out.println(this.display() + " health is " + this.getHealth());
                    }
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
