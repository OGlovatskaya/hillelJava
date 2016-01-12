package HomeWork13;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

/**
 * Created by user on 11.01.2016.
 */
public class BufferedNorBuffered {
    public static void main(String[] args) {

        notBuffered();
        buffered();
    }

    private static void buffered() {
        Instant begin = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\user\\Desktop\\from.txt")));
             BufferedWriter buffereWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\user\\Desktop\\to.txt")))) {
            String value = null;
            begin = Instant.now();
            while ((value = bufferedReader.readLine()) != null) {
                buffereWriter.write(value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        Instant end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of read/write using buffered stream is "
                + milliseconds + " milliseconds");
    }

    private static void notBuffered() {
        Instant begin = null;
        try (InputStream inputStream = new FileInputStream("C:\\Users\\user\\Desktop\\from.txt");
             OutputStream outputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\to.txt")
        ) {
            begin = Instant.now();
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        Instant end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Duration of read/write using not buffered stream is "
                + milliseconds + " milliseconds");
    }
}
