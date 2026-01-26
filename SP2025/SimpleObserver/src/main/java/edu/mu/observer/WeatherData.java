package edu.mu.observer;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private Double temp = 0.0;
	private boolean isTempDrop = false;
	
	public WeatherData() {

	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		if(this.temp > temp.doubleValue()) {
			setTempDrop(true);
		}
		else { 
			setTempDrop(false);
		}
		this.temp = temp;
		setChanged();
		notifyObservers(this);
		
	}

	public boolean isTempDrop() {
		return isTempDrop;
	}

	public void setTempDrop(boolean isTempDrop) {
		this.isTempDrop = isTempDrop;
	}

}
