package HomeWork10.Game;

/**
 * Created by user on 04.11.2015.
 */
public class Game {
    public static void main(String[] args) {
        Character human = new Human();
        Weapon bow = new Bow();
        print(human, bow);

        Character orc = new Orc();
        Weapon hammer = new Hammer();
        print(orc, hammer);

        Character elf = new Elf();
        Weapon sword = new Sword();
        print(elf, sword);

    }

    public static void print(Character character, Weapon weapon){
        character.setWeapon(weapon);
        System.out.println(character.display());
    }
}
