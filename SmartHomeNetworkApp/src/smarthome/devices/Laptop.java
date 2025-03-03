package smarthome.devices;

import smarthome.devices.status.DeviceState;

public class Laptop extends CastableElectronicDevice {
	
	public void playGames(String gameName) {
		System.out.println("Playing " + gameName);
	}

	@Override
	public String toString() {
		return "Laptop [toString()=" + super.toString() + "]";
	}

	@Override
	public void powerOn() {
		System.out.println("Turning on Laptop...");
		try {
			Thread.sleep(200);
			System.out.println("Laptop ready to use!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setState(DeviceState.ON);
	}

	
}
