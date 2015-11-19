package IO;

import java.io.*;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.*;
import java.util.Iterator;

/**
 * Created by OGlovatskaya on 19.11.2015.
 */
public class IOMain {
    public static void main(String[] args) /*throws IOException*/ {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("d:/myData.dat"))) {
            long[] longs = new long[]{1, 2, 3, 5, 4};

            for (long aLong : longs) {
                dataOutputStream.writeLong(aLong);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try (DataInputStream dataOutputStream = new DataInputStream(new FileInputStream("d:/myData.dat"))) {
            try {
                while (true) {
                    System.out.println(dataOutputStream.readLong());
                }
            } catch (EOFException e) {
                System.out.println("end");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        //bufferedRead();
        //charRead();
        //copyBytes();
        //autoclosable();
        //readWithResources();
        //uglyRead();
        //pathsAndFileCreations();
    }

    private static void bufferedRead() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/myFile.txt"), Charset.forName("windows-1251")))) {
            String value = null;
            while ((value = bufferedReader.readLine()) != null) {
                System.out.println(value);
            }
            //throw new IOException("file blabla.txt not found");
        } catch (IOException e) {
            System.out.println(e);//pri etom podxode programma napechataet predyprejdenie i poidet vipolniatsia dal'she
            throw new RuntimeException(e); // pri etom podxode eta programma dal'she vipolniatsia ne bydet
        }
    }

    private static void charRead() {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("d:/myFile.txt"), Charset.forName("windows-1251"))) {
            int value;
            while ((value = inputStreamReader.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void copyBytes() {
        try (InputStream inputStream = new FileInputStream("d:/myFile.txt");
             OutputStream outputStream = new FileOutputStream("d:/copyOfMyFile.txt")
        ) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void autoclosable() {
        try (MyClosable c = new MyClosable()) {

        }
    }

    private static void readWithResources() {
        //try s resyrsami
        try (InputStream inputStream = new FileInputStream("d:/myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void uglyRead() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("d:/myFile.txt");

            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.println((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    private static void pathsAndFileCreations() throws IOException {
        System.out.println("yes\\no");
        System.out.println("c:\\program files\\myProgram");
        System.out.println("c:/program files/myProgram");
        String win = "c:\\HaxLogs.txt";
        String unix = "c:/HaxLogs.txt";

        //starij podxod
        File winFile = new File(win);
        System.out.println("win file exists: " + winFile.exists());

        File unixFile = new File(unix);
        System.out.println("unix file exists: " + unixFile.exists());

        //novij podxod
        Path path = Paths.get("myFile.txt");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path absolutePath = Paths.get("d:/myFile.txt");
        System.out.println(absolutePath);
        System.out.println(absolutePath.toAbsolutePath());

        if (!Files.exists(absolutePath)) {
            Files.createFile(absolutePath);
            System.out.println("file created");
        } else {
            System.out.println("file already exists");
        }
    }
}

class MyClosable implements AutoCloseable {

    @Override
    public void close() {

    }
}