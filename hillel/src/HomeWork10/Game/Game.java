package HomeWork10.Game;

/**
 * Created by user on 04.11.2015.
 */
public class Game {
    public static void main(String[] args) {
        Character human = new Human();
        human.weapon = new Bow();
        print(human);

        Character orc = new Orc();
        orc.weapon = new Hammer();
        print(orc);

        Character elf = new Elf();
        elf.weapon = new Sword();
        print(elf);

    }

    public static void print(Character character){
        System.out.print(character.display());
        System.out.println(character.typeOfWeapon());
    }
}
