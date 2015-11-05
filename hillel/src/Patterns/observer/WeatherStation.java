package Patterns.observer;

/**
 * Created by OGlovatskaya on 05.11.2015.
 */
public class WeatherStation {
    int temperature;
    int humidity;
    int pressure;

    WeatherDisplay current = new WeatherDisplay();
    WeatherStatistic statistic = new WeatherStatistic();

    public void measumentChanged(){
        current.set(temperature, humidity, pressure);
        current.display();

        statistic.set(temperature, humidity, pressure);
        statistic.display();
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
