package HomeWork9.Statistics;

import java.time.Duration;
import java.time.Instant;
import java.util.TreeSet;

/**
 * Created by user on 18.11.2015.
 */
public class TreeSetStatistics {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < 1000000; i++){
            treeSet.add(i);
        }

        Instant begin = Instant.now();
        treeSet.add(1000001);
        Instant end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of adding elements to TreeSet is " + milliseconds + " milliseconds");

        begin = Instant.now();
        treeSet.contains(500000);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of search by value in TreeSet is " + milliseconds + " milliseconds");

        begin = Instant.now();
        treeSet.remove(1);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of removal by value in TreeSet is " + milliseconds + " milliseconds");
    }
}
