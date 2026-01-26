package edu.mu.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentTempratureDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		WeatherData temp = (WeatherData) arg;
		if(temp.isTempDrop()) {
			System.out.println("Detected a drop: " + temp.getTemp());
		}
		
	}

}
