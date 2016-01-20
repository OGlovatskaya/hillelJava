package HomeWork10.Game;

/**
 * Created by user on 04.11.2015.
 */
public class Game {
    public static void main(String[] args) throws InterruptedException {
        Character human = new Human();
        System.out.println(human.getCuttingDamage());
        Weapon bow = new Bow();
        System.out.println(bow.getPiercingDamage());
        print(human, bow);

        Character orc = new Orc();
        System.out.println(orc.getCrushingDamage());
        Weapon hammer = new Hammer();
        System.out.println(hammer.getCrushingDamage());
        print(orc, hammer);

        Character elf = new Elf();
        System.out.println(elf.getPiercingDamage());
        Weapon sword = new Sword();
        System.out.println(sword.getCuttingDamage());
        print(elf, sword);

        Fight fight = new Fight(orc, elf);
        fight.start();
        fight.join();

    }

    public static void print(Character character, Weapon weapon) {
        character.setWeapon(weapon);
        System.out.print(character.display() + " attacked with a " + weapon.typeOfWeapon());
        System.out.println(",total damage is " + character.totalDamage());
    }
}
