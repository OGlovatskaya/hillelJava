package Patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OGlovatskaya on 05.11.2015.
 */
public class WeatherStatistic implements WeatherObserver{
    List<Integer> temperatures = new ArrayList<>();
    List<Integer> humidities = new ArrayList<>();
    List<Integer> pressures = new ArrayList<>();

    public void updateWeather(WeatherStation stations){
        temperatures.add(stations.getTemperature());
        humidities.add(stations.getHumidity());
        pressures.add(stations.getPressure());
    }

    public void display(){
        System.out.println("Statistic: " + "temperatures: " + temperatures +
                ", humidities" + humidities +
                ", pressures: " + pressures);
    }
}
