package smarthome.devices;

import java.util.Random;

import smarthome.devices.status.DeviceState;

public class SmartPhone extends CastableElectronicDevice {
	
	

	public SmartPhone() {
		System.out.println("This is an object of SmartPhone");
//		super.printName();
	}

	public SmartPhone(DeviceState state) {

	}
	
	public boolean makeCall(String contact) {
		Random rand = new Random();
		System.out.println("Calling " + contact + " ...");
		if(rand.nextBoolean()) {
			System.out.println("Call answered!");
			return true;
		}
		System.out.println("No response");
		return false;
	}

	@Override
	public String toString() {
		return "SmartPhone [toString()=" + super.toString() + "]";
	}

	@Override
	public void powerOn() {
		System.out.println("Turning on Smart phone...");
		try {
			Thread.sleep(1000);
			System.out.println("Smart phone ready to use!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setState(DeviceState.ON);
	}
	
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		super.powerOff();
	}
	
}
