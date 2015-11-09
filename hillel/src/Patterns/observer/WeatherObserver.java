package Patterns.observer;

/**
 * Created by OGlovatskaya on 09.11.2015.
 */
public interface WeatherObserver {
    void updateWeather(WeatherStation station);
    //void set(int temperature, int humidity, int pressure);
}
