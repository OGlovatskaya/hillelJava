/**
 * Created by OGlovatskaya on 17.09.2015.
 */
public class MyFirstClass {
    public static void main(String[] args) {
        sayHello();

        int age = 30;

        age = someMethod(age);

        System.out.println(age);

    }

    private static int someMethod(int age) {
        System.out.println(age);
        age = 50;
        return (age);
    }

    private static void ageCalculation() {
        final int maxBirthYear = 1984;


        int maxAge = calculateAge(maxBirthYear);
        System.out.println("max age: " + maxAge);

        int alexAge = calculateAge(1981);
        ;
        System.out.println("alex age: " + alexAge);
    }

    private static void firstExample(int age) {
        //System.out.println("Before changes " + maxBirthYear);

        //maxBirthYear = 2015;

        System.out.println("I'm " + age);


        System.out.println("31" + 31);
        System.out.println(31 +31);
        // System.out.println("After changes " + maxBirthYear);

        //String string = "31";
        //int i = string;
    }

    public  static void sayHello() {
        String helloMessage = "Hello world";
        System.out.println(helloMessage);

    }

    public static int calculateAge(){
        final int BirthYear = 1984;

        int year = 2015;
        int age = year - BirthYear;
        return age;
    }

    public static int calculateAge(int BirthYear){

        int year = 2015;
        int age = year - BirthYear;
        return age;
    }

}
