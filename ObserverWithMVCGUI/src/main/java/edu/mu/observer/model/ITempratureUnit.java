package edu.mu.observer.model;

public interface ITempratureUnit {
	
	public Double getTemprature();
	public void setTemprature(Double temp);
	public CelsiusModel toCelsius();
	public KelvinModel toKelvin();
	public FahrenaitModel toFahrenait();
	
}
