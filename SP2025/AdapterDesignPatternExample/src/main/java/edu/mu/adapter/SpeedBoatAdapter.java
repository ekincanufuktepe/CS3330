package edu.mu.adapter;

public class SpeedBoatAdapter implements IRowingBoat {
	
	private SpeedBoat speedBoat;
	
	public SpeedBoatAdapter() {
		this.speedBoat = new SpeedBoat();
	}

	@Override
	public void row() {
		speedBoat.fullThrottle();
	}

}
