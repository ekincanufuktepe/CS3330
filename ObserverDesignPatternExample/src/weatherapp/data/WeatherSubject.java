package weatherapp.data;

import weatherapp.display.WeatherObserver;

public interface WeatherSubject {

	public void addObserver(WeatherObserver observer);
	public void removeObserver(WeatherObserver observer);
	public void notifyObservers();
	
}
