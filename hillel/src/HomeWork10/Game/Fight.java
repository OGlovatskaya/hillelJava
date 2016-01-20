package HomeWork10.Game;

/**
 * Created by user on 17.01.2016.
 */
public class Fight extends Thread{
    private Character character1;
    private Character character2;

    public Fight(Character character1, Character character2) {
        this.character1 = character1;
        this.character2 = character2;
    }

    @Override
    public void run() {
        while (true) {
            try {

                Thread.sleep(500);
                if (character1.getHealth() > 0 && character2.getHealth() > 0) {
                    int newHealth1 = character1.getHealth() - character2.totalDamage();
                    if (newHealth1 >= 0) {
                        character1.setHealth(newHealth1);
                    } else {
                        character1.setHealth(0);
                    }
                    System.out.println(character2.display() + " attacked! " + character1.display() + "'s health is " + character1.getHealth());
                } else break;

                Thread.sleep(500);
                if (character1.getHealth() > 0 && character2.getHealth() > 0) {
                    int newHealth2 = character2.getHealth() - character1.totalDamage();
                    if (newHealth2 >= 0) {
                        character2.setHealth(newHealth2);
                    } else {
                        character2.setHealth(0);
                    }
                    System.out.println(character1.display() + " attacked! " + character2.display() + "'s health is " + character2.getHealth());
                } else break;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (character1.getHealth() > character2.getHealth()) {
            System.out.println(character1.display() + " has won!");
        } else if (character2.getHealth() > character1.getHealth()){
            System.out.println(character2.display() + " has won!");
        }
    }
}
