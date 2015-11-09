package Patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OGlovatskaya on 05.11.2015.
 */
public class WeatherStation {
    private int temperature;
    private int humidity;
    private int pressure;

    private List<WeatherObserver> observers = new ArrayList<>();

    /*WeatherDisplay current = new WeatherDisplay();
    WeatherStatistic statistic = new WeatherStatistic();  - programirovanie na yrovne realizacii
    WeatherForecast forecast = new WeatherForecast();*/

    public void measumentChanged(){
        for (WeatherObserver observer : observers){
            observer.updateWeather(this);
        }
    }

    /*public void measumentChanged(){
        current.set(temperature, humidity, pressure);
        current.display();

        statistic.set(temperature, humidity, pressure);
        statistic.display();

        forecast.set(temperature,humidity,pressure);
        forecast.display();
    }*/

    public void register(WeatherObserver observer){
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer){

    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humildity) {
        this.humidity = humildity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
