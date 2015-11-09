package Patterns.observer;

/**
 * Created by OGlovatskaya on 05.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args){

        WeatherStation station = new WeatherStation();
        WeatherDisplay current = new WeatherDisplay();
        WeatherStatistic statistic = new WeatherStatistic();
        WeatherForecast forecast = new WeatherForecast();

        station.register(current);
        station.register(statistic);
        station.register(forecast);

        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);

        station.measumentChanged();

        current.display();
        statistic.display();
        forecast.display();

        System.out.println();

        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);

        station.removeObserver(current);

        station.measumentChanged();

        current.display();
        statistic.display();
        forecast.display();

    }
}
