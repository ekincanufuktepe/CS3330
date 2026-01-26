package edu.mu.observer.model;

import java.util.Observable;

public class CelsiusModel extends Observable implements ITempratureUnit {
	
	private Double temprature;
	
	public CelsiusModel() {
		this.temprature = 0.0;
	}

	@Override
	public Double getTemprature() {
		return temprature;
	}

	@Override
	public void setTemprature(Double temp) {
		this.temprature = temp;
		setChanged();
		notifyObservers();
	}

	@Override
	public CelsiusModel toCelsius() {
		return this;
	}

	@Override
	public KelvinModel toKelvin() {
		KelvinModel kelvin = new KelvinModel();
		kelvin.setTemprature(temprature + 273);
		return kelvin;
	}

	@Override
	public FahrenaitModel toFahrenait() {
		FahrenaitModel fahrenait = new FahrenaitModel();
		fahrenait.setTemprature(temprature*1.8 + 32);
		return fahrenait;
	}

}
