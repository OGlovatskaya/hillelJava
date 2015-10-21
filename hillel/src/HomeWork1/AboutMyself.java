package HomeWork1;

/**
 * Created by user on 18.09.2015.
 */
public class AboutMyself {
    public static void main(String[] args) {
        String myName = "Olga";
        String mySurname = "Glovatskaya";
        //System.out.println(myName + " " + mySurname);
        System.out.print(myName);
        System.out.print(" ");
        System.out.println(mySurname);

        int birthYear = 1988;
        int presentYear = 2015;
        int myAge = presentYear - birthYear;
        System.out.print("I'm " + myAge + " years old");
    }

    }
