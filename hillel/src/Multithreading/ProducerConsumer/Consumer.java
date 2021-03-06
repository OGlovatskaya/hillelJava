package Multithreading.ProducerConsumer;

/**
 * Created by OGlovatskaya on 03.12.2015.
 */
public class Consumer extends Thread {
    private Bucket bucket;

    public Consumer(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            bucket.get();
        }
    }
}
