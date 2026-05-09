package edu.mu.cs3330.adapter.boat;

public class SailBoatAdapter implements IRowingBoat {
	
	private SailBoat boat = null;
	
	public SailBoatAdapter() {
		this.boat = new SailBoat();
	}

	@Override
	public void row() {
		boat.sail();
	}

}
