package edu.mu.observer.model;

public class FahrenaitModel implements ITempratureUnit {

private Double temprature;
	
	public FahrenaitModel() {
		this.temprature = 0.0;
	}

	@Override
	public Double getTemprature() {
		return temprature;
	}

	@Override
	public void setTemprature(Double temp) {
		if(temprature == temp)
		this.temprature = temp;
	}

	@Override
	public CelsiusModel toCelsius() {
		CelsiusModel celsius = new CelsiusModel();
		celsius.setTemprature((temprature.doubleValue()-32)/1.8);
		return celsius;
	}

	@Override
	public KelvinModel toKelvin() {
		KelvinModel kelvin = new KelvinModel();
		kelvin.setTemprature(toCelsius().toKelvin().getTemprature());
		return kelvin;
	}

	@Override
	public FahrenaitModel toFahrenait() {
		return this;
	}

}
