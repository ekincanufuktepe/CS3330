package weatherapp;

import weatherapp.data.WeatherStation;
import weatherapp.display.PhoneDisplay;
import weatherapp.display.TwitterDisplay;

public class Main {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		
		station.setTemperature(65.0f);
		
		PhoneDisplay phone = new PhoneDisplay();
		TwitterDisplay twitter = new TwitterDisplay();
		
		station.addObserver(phone);
		station.addObserver(twitter);
		
		station.setTemperature(68.0f);
		
		station.removeObserver(twitter);
		
		station.setTemperature(72.0f);
		
	}

}
