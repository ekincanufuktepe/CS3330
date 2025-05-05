package edu.mu.observer;

public class Main {

	public static void main(String[] args) {
		WeatherData model = new WeatherData();
		CurrentTempratureDisplay view = new CurrentTempratureDisplay();
		AnotherTempratureDisplay view2 = new AnotherTempratureDisplay();
		model.addObserver(view);
		model.addObserver(view2);
		model.setTemp(15.0);
		
		model.setTemp(20.0);
		
		model.setTemp(10.0);

	}

}
