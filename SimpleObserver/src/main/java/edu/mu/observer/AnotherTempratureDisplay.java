package edu.mu.observer;

import java.util.Observable;
import java.util.Observer;

public class AnotherTempratureDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		WeatherData temp = (WeatherData) arg;
		System.out.println("Another Temprature display: " + temp.getTemp());
	}
}
