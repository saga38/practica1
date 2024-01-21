package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Sujeto {

    private List<Observador> observers;
    private int temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observador observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observador observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observador observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

