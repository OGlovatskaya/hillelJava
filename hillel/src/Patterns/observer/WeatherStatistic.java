package Patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OGlovatskaya on 05.11.2015.
 */
public class WeatherStatistic {
    List<Integer> temperatures = new ArrayList<>();
    List<Integer> humidities = new ArrayList<>();
    List<Integer> pressures = new ArrayList<>();

    public void set(int temperature, int humiditie, int pressure){
        temperatures.add(temperature);
        humidities.add(humiditie);
        pressures.add(pressure);
    }

    public void display(){
        System.out.println("Statistic: " + "temperatures: " + temperatures + ", humidities" + humidities + ", pressures: " + pressures);
    }
}
