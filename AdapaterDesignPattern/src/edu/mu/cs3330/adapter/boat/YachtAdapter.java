package edu.mu.cs3330.adapter.boat;

public class YachtAdapter implements IRowingBoat {
	
	private Yacht boat = null;
	
	public YachtAdapter() {
		this.boat = new Yacht();
	}

	@Override
	public void row() {
		boat.relax();
	}

}
