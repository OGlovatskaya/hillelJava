package Multithreading;

/**
 * Created by OGlovatskaya on 30.11.2015.
 */
public class MultithreadingMain {
    public static void main(String[] args) {

        Thread otherThread = new Thread(() -> {
            System.out.println("other thread begin");

            /*try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("other thread is interrupted");
            }*/

            while (! Thread.currentThread().isInterrupted()){

            }
            /*if (! Thread.currentThread().isInterrupted()){
                return;
            }*/
            System.out.println("other thread end");
        });

        //otherThread.setDaemon(true);
        otherThread.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        otherThread.interrupt();

        try {
            otherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread end");


        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("other otherThread");
            }
        });*/

    }
}
