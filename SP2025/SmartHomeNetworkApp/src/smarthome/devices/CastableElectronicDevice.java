package smarthome.devices;

public abstract class CastableElectronicDevice extends ElectronicDevice {

	public String name;
	
	public CastableElectronicDevice() {
		System.out.println("This is the CastableElectroniDevice object created");
	}
	
	protected void printName() {
		System.out.println(name);
	}
}
