package smarthome.devices;

import smarthome.devices.status.DeviceState;

public abstract class ElectronicDevice {
	
	private DeviceState state;
	
	public ElectronicDevice() {
		System.out.println("ElectronicDevice object created");
//		this.setState(DeviceState.OFF);
	}
	
	public ElectronicDevice(DeviceState state) {
		System.out.println("ElectronicDevice object created parameterized constructor");
		this.state = state;
	}
	
	public abstract void powerOn();
	
	public void powerOff() {
		System.out.println("Power off");
	}

	public DeviceState getState() {
		return state;
	}

	public void setState(DeviceState state) {
		this.state = state;
	}

}
