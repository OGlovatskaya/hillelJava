package HomeWork9.Statistics;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

/**
 * Created by user on 18.11.2015.
 */
public class ArrayListStatistics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }

        Instant begin = Instant.now();
        arrayList.add(0, 1);
        Instant end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of adding elements to the beginning of the ArrayList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        arrayList.add(10000001);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of adding elements to the end of the ArrayList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        arrayList.get(4999999);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of search by index in ArrayList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        arrayList.contains(10000000);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of search by value in ArrayList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        arrayList.remove(0);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by index from the beginning of the ArrayList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        arrayList.remove(4999999);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by index from the middle of the ArrayList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        arrayList.remove(9999999);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by index from the end of the ArrayList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        arrayList.remove(1);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by value from the beginning of the ArrayList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        arrayList.remove(4999997);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by value from the middle of the ArrayList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        arrayList.remove(9999996);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by value from the end of the ArrayList is "
                + milliseconds + " milliseconds");
    }
}
