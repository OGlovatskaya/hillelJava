package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by OGlovatskaya on 14.01.2016.
 */
public class JavaMain {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Red", 150));
        apples.add(new Apple("Green", 180));
        apples.add(new Apple("Yellow", 155));
        apples.add(new Apple("Red", 200));



        /*Filtrator redFilter = new ReadFilter();

        List<Apple> readApples = filter(apples,redFilter);
        List<Apple> redAndHeavyApples = filter(readApples, new Filtrator() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 170;
            }
        });


        redAndHeavyApples = filter(readApples, JavaMain::isHeavy);*/

        List<Apple> heavyApples = filter(apples, JavaMain::isHeavy);

        heavyApples = filter(apples, apple -> apple.getWeight() > 170);

        heavyApples = apples
                .stream()
                .filter(JavaMain::isHeavy)
                .filter(apple -> apple.getColor().equals("Red"))
                .collect(Collectors.toList());

        System.out.println(heavyApples);
    }

    public static boolean isHeavy(Apple apple) {
        return apple.getWeight() > 170;
    }

    /*private static List<Apple> filterHeavy(List<Apple> readApples) {
        List<Apple> redAndHeavyApples = new ArrayList<>();
        for (Apple apple : readApples){
            if (apple.getWeight() > 170){
                redAndHeavyApples.add(apple);
            }
        }

        return redAndHeavyApples;
    }*/

    private static List<Apple> filter(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> readApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                readApples.add(apple);
            }
        }
        return readApples;
    }

    /*private static List<Apple> filter(List<Apple> apples, Filtrator filtrator) {
        List<Apple> readApples = new ArrayList<>();
        for (Apple apple : apples){
            if (filtrator.test(apple)){
                readApples.add(apple);
            }
        }
        return readApples;
        }*/

        /*List<Apple> readApples = new ArrayList<>();
        for (Apple apple : apples){
            if (apple.getColor().equals("Red")){ //vmesto equals mojno == t.k. est' pool String
                readApples.add(apple);
            }
        }
        String notPulled = new String("Red"); // ne popadaet v pool String
        notPulled.intern(); // posle etogo popadet v pool String
        return readApples;*/


    private static void defaultMethodExample() {
        Fruit fruit = new Apple();

        System.out.println(fruit.chop());

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(6);
        integers.add(4);

        Collections.sort(integers);

        integers.sort(JavaMain::sortIntsAsc);

        integers.sort((o1, o2) -> o1.compareTo(o2));

        List<Integer> ints = Collections.emptyList();

        /*integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });*/

        System.out.println(integers);
    }

    public static int sortIntsAsc(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
