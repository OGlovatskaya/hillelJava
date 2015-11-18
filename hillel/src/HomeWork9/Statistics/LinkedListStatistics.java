package HomeWork9.Statistics;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

/**
 * Created by user on 18.11.2015.
 */
public class LinkedListStatistics {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 1000000; i++){
            linkedList.add(i);
        }

        Instant begin = Instant.now();
        linkedList.add(0, 1);
        Instant end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of adding elements to the beginning of the LinkedList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        linkedList.add(1000001);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of adding elements to the end of the LinkedList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        linkedList.get(500000);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of search by index in LinkedList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        linkedList.contains(899999);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of search by value in LinkedList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        linkedList.remove(0);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by index from the beginning of the LinkedList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        linkedList.remove(499997);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by index from the middle of the LinkedList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        linkedList.remove(999999);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by index from the end of the LinkedList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        linkedList.remove(1);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by value from the beginning of the LinkedList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        linkedList.remove(499998);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by value from the middle of the LinkedList is "
                + milliseconds + " milliseconds");

        begin = Instant.now();
        linkedList.remove(999996);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by value from the end of the LinkedList is "
                + milliseconds + " milliseconds");
    }
}
