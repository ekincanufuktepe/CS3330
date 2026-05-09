package weatherapp.display;

public class TwitterDisplay implements WeatherObserver {

	@Override
	public void update(Float temperature) {
		System.out.println("Twitter Display: " + temperature.floatValue() + " \u00B0"+"F");
	}

}
