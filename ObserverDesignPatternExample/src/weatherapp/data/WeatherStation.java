package weatherapp.data;

import java.util.ArrayList;
import java.util.List;

import weatherapp.display.WeatherObserver;

public class WeatherStation implements WeatherSubject {
	
	private final List<WeatherObserver> observers = new ArrayList<>();
	private Float temperature = null;

	@Override
	public void addObserver(WeatherObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(WeatherObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(WeatherObserver observer : observers) {
			observer.update(temperature);
		}
	}
	
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
		notifyObservers();
	}

}
