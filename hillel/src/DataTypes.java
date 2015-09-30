/**
 * Created by OGlovatskaya on 21.09.2015.
 */
public class DataTypes {
    public static void main(String[] args) {
        byte b = 120;
        short s = b;
        long l = s;

        double d = 1;

        l = 15;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Integer max value is: " + maxValue);
        long intMaxValue = maxValue;
        long intOverFlow = intMaxValue + 1;

        int i = (int) intOverFlow;
        System.out.println("overflowed int " + i);

        d = Math.PI;
        i = (int) d;
        System.out.println("PI is: " + i);

        i = (int) 3.9;
        System.out.println("3.9 after converting: " + i);


        //realNumberComparion();
        //primitiveDataTypes();
    }

    private static void realNumberComparion() {
        if (1.1 + 2.2 == 3.3) {
            System.out.println("they are equal");
        }else {
            System.out.println("they aren't equal");
        }
        System.out.println("1.1 + 2.2 = " + (1.1 + 2.2));
    }

    private static void primitiveDataTypes() {
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
