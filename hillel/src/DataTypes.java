/**
 * Created by OGlovatskaya on 21.09.2015.
 */
public class DataTypes {
    public static void main(String[] args) {
        int age = 31;

        int days = age * 365;

        int hours = days * 24;

        int seconds = hours * 3600;

        long milliseconds = seconds * 1000L;

        long longSeconds = milliseconds / 1000;

        seconds = (int) longSeconds;

        seconds = (int) (milliseconds / 1000);

        //seconds = (int) (milliseconds / 1000); vrong

        System.out.println(milliseconds);

        double d = 3.54F;
        int i = 10;
        long l = 5000000000L;
        float f = 2.5F;
    }

}
