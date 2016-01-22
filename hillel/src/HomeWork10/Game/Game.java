package HomeWork10.Game;

/**
 * Created by user on 04.11.2015.
 */
public class Game {
    public static void main(String[] args) throws InterruptedException {
        Character orc = new Orc();
        Weapon hammer = new Hammer();
        orc.setWeapon(hammer);


        Character elf = new Elf();
        Weapon sword = new Sword();
        elf.setWeapon(sword);

        while (true) {
            try {

                Thread.sleep(500);
                if (orc.getHealth() > 0 && elf.getHealth() > 0) {
                    int newHealth1 = orc.getHealth() - elf.totalDamage();
                    if (newHealth1 >= 0) {
                        orc.setHealth(newHealth1);
                    } else {
                        orc.setHealth(0);
                    }
                    System.out.println(elf.display() + " attacked! " + orc.display() + "'s health is " + orc.getHealth());
                } else break;

                Thread.sleep(500);
                if (elf.getHealth() > 0 && orc.getHealth() > 0) {
                    int newHealth2 = elf.getHealth() - orc.totalDamage();
                    if (newHealth2 >= 0) {
                        elf.setHealth(newHealth2);
                    } else {
                        elf.setHealth(0);
                    }
                    System.out.println(orc.display() + " attacked! " + elf.display() + "'s health is " + elf.getHealth());
                } else break;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (orc.getHealth() > elf.getHealth()) {
            System.out.println(orc.display() + " has won!");
        } else if (elf.getHealth() > orc.getHealth()){
            System.out.println(elf.display() + " has won!");
        }


    }
}
