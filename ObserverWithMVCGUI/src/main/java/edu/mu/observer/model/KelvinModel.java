package edu.mu.observer.model;

public class KelvinModel implements ITempratureUnit {

	private Double temprature;
	
	public KelvinModel() {
		this.temprature = 0.0;
	}

	@Override
	public Double getTemprature() {
		return temprature;
	}

	@Override
	public void setTemprature(Double temp) {
		this.temprature = temp;
	}

	@Override
	public CelsiusModel toCelsius() {
		CelsiusModel celsius = new CelsiusModel();
		celsius.setTemprature(temprature.doubleValue()-273);
		return celsius;
	}

	@Override
	public KelvinModel toKelvin() {
		return this;
	}

	@Override
	public FahrenaitModel toFahrenait() {
		FahrenaitModel fahrenait = new FahrenaitModel();
		fahrenait.setTemprature(this.toCelsius().toFahrenait().getTemprature());
		return fahrenait;
	}

}
