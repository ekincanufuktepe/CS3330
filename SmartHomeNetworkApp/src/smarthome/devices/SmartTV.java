package smarthome.devices;

import smarthome.devices.status.DeviceState;

public class SmartTV extends NonCastableElectronicDevice {
	
	public SmartTV() {
		// TODO Auto-generated constructor stub
	}

	public boolean castDevice(CastableElectronicDevice device) {
		System.out.println("Casting " + device);
		return true;
	}

	@Override
	public String toString() {
		return "SmartTV [toString()=" + super.toString() + "]";
	}

	@Override
	public void powerOn() {
		System.out.println("Turning on Smart TV...");
		try {
			Thread.sleep(5000);
			System.out.println("Smart TV ready to use!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setState(DeviceState.ON);
	}
	
	
}
