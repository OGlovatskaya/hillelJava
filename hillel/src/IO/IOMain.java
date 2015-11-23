package IO;

import com.sun.corba.se.impl.logging.ORBUtilSystemException;

import java.io.*;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 * Created by OGlovatskaya on 19.11.2015.
 */
public class IOMain {
    public static void main(String[] args) /*throws IOException*/ {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\OGlovatskaya\\IdeaProjects\\MyHillelJava\\hillel\\config.properties")){
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String carOwner = properties.getProperty("carOwner");
            String carYear = properties.getProperty("carYear");
            String carModel = properties.getProperty("carModel");

            CarOwner owner = new CarOwner(carOwner);
            Car car = new Car(carModel, Integer.parseInt(carYear), owner, "black");
            System.out.println(car);

        }catch (IOException e) {
            System.out.println(e);
        }
        //serialVersionUID();
        //objectStore();
        //arrays();
        //primitiveTypes();
        //bufferedRead();
        //charRead();
        //copyBytes();
        //autoclosable();
        //readWithResources();
        //uglyRead();
        //pathsAndFileCreations();
    }

    private static void serialVersionUID() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("d:/myData.dat"))) {
            List<Car> cars = (List<Car>) inputStream.readObject();
            System.out.println(cars);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private static void objectStore() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("d:/myData.dat"))) {

            CarOwner owner = new CarOwner("Ivan");

            List<Car> cars = Arrays.asList(new Car("BMW", 1985, owner, "White"), new Car("Audi", 2015, owner, "Black"));

            for (Car car : cars) {
                owner.addCar(car);
            }

            outputStream.writeObject(cars);
        } catch (IOException e) {
            System.out.println(e);
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("d:/myData.dat"))) {
            List<Car> cars = (List<Car>) inputStream.readObject();
            System.out.println(cars);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private static void arrays() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("d:/myData.dat"))) {
            long[] longs = new long[]{1, 2, 3, 5, 4};
            outputStream.writeObject(longs);
        } catch (IOException e) {
            System.out.println(e);
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("d:/myData.dat"))) {
            long[] longs = (long[]) inputStream.readObject();
            System.out.println(Arrays.toString(longs));
            //Object longsAsObject = inputStream.readObject();
            //long[] longs = (long[]) longsAsObject;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private static void primitiveTypes() {
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