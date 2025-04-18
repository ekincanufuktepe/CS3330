package edu.mu.adapter;

public class SailBoatAdapter implements IRowingBoat {

	private SailBoat sailBoat = null;
	
	public SailBoatAdapter() {
		this.sailBoat = new SailBoat();
	}
	
	@Override
	public void row() {
		this.sailBoat.sail();
	}

}
