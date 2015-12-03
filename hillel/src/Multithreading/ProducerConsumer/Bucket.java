package Multithreading.ProducerConsumer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by OGlovatskaya on 03.12.2015.
 */
public class Bucket {

    private final int maxCount = 50;
    private int count;
    //private volatile AtomicInteger i = new AtomicInteger();

    public synchronized void put() {
        //int c = i.incrementAndGet();

        while (count == maxCount) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                //e.printStackTrace();
                return;
            }
        }
        count++;
        notifyAll();
    }

    public synchronized void get() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                //e.printStackTrace();
                return;
            }
        }
        count--;
        notifyAll();
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "count=" + count +
                '}';
    }
}
