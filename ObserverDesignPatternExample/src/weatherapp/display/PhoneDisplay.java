package weatherapp.display;

public class PhoneDisplay implements WeatherObserver {

	@Override
	public void update(Float temperature) {
		System.out.println("Phone Display: " + temperature.floatValue() + " \u00B0"+"F");
	}

}
