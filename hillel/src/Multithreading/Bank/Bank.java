package Multithreading.Bank;

/**
 * Created by OGlovatskaya on 30.11.2015.
 */
public class Bank {
    private int account1 = 50_000;
    private int account2 = 50_000;
    private final Object lockObject = new Object();

    public void transaction(int amount, boolean direction) {
        if (direction) {
            synchronized (lockObject) {
                account1 -= amount;
                account2 += amount;
            }
        } else {
            synchronized (lockObject) {
                account2 -= amount;
                account1 += amount;
            }
        }
    }

    @Override
    public synchronized String toString() {
        return "Bank{" +
                "account1=" + account1 +
                ", account2=" + account2 +
                ", sum= " + (account1 + account2) +
                '}';
    }
}
