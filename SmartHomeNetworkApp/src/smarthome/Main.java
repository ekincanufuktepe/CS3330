package smarthome;

import smarthome.devices.CastableElectronicDevice;
import smarthome.devices.ElectronicDevice;
import smarthome.devices.Laptop;
import smarthome.devices.SmartPhone;
import smarthome.devices.SmartTV;
import smarthome.devices.status.DeviceState;

public class Main {

	public static void main(String[] args) {
//		ElectronicDevice device = new ElectronicDevice();
//		CastableElectronicDevice device = new CastableElectronicDevice();
		SmartPhone phone = new SmartPhone();
		phone.makeCall("Mom");
		phone.powerOn();
		
		Laptop pc = new Laptop();
		pc.powerOn();
		
		SmartTV tv = new SmartTV();
		tv.castDevice(phone);
		tv.castDevice(pc);
		tv.powerOn();
//		tv.castDevice(tv); // Cannot cast SmartTV, because it is not a CastableElectronicDevice.
//		SmartPhone phone2 = new SmartPhone(DeviceState.ON);
	}

}
