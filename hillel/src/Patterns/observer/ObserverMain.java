package Patterns.observer;

/**
 * Created by OGlovatskaya on 05.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args){

        WeatherStation station = new WeatherStation();
        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);

        station.measumentChanged();

        System.out.println();

        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);

        station.measumentChanged();

    }
}
