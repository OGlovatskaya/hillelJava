package Collections.multableStale;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by OGlovatskaya on 02.11.2015.
 */
public class Main {
    public static void main(String[] args){
        Set<Car> dreamList = new TreeSet<>(new CarComparator());

        Car peterDream = new Car("Mercedes-benz", 2015);
        Car ivanDream = new Car("Audi", 2015);
        Car alexDream = new Car("Porsche", 2015);

        dreamList.add(ivanDream);
        dreamList.add(peterDream);
        dreamList.add(alexDream);

        System.out.println(dreamList);

        dreamList.remove(alexDream);

        //alexDream.model = "Acura"; - pole "model" teper' "final" i ego nel'zia izmeniat'

        dreamList.add(alexDream);

        System.out.println("ivan's dream in list: " + dreamList.contains(ivanDream));
        System.out.println("peter's dream in list: " + dreamList.contains(peterDream));
        System.out.println("alex's dream in list: " + dreamList.contains(alexDream));

        System.out.println(dreamList);

        dreamList.remove(alexDream);
        alexDream = new Car("Porsche", 2015);
        dreamList.add(alexDream);

        String s = "asd";
        String copy = s;
        s += "aaa";

        System.out.println(copy == s);

        Integer i = 255;
        Integer copyI = i;

        i++;
        System.out.println(i);
        copyI = 256;
        System.out.println(i == copyI);

        /*Integer i = 1;
        Integer copyI = i;

        i++;
        System.out.println(i);                        //integer pool
        copyI = 2;
        System.out.println(i == copyI);*/

        Set<Car> hashedCars = new HashSet<>();
        hashedCars.add(alexDream);
        hashedCars.add(peterDream);
        hashedCars.add(ivanDream);

        Car seekedCar = new Car("Porsche", 2015);
        System.out.println("hashCode is: " + seekedCar.hashCode());
        System.out.println("hashSet contains Porsche: " + hashedCars.contains(seekedCar));
        //System.out.println("hashSet contains Porsche: " + hashedCars.contains(new Car("Porsche", 2015)));
    }
}
