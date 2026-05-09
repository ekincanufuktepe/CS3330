package edu.mu.cs3330.adapter.captain;

import edu.mu.cs3330.adapter.boat.IRowingBoat;

public class Captain {
	
//	private RowingBoat boat;
	private IRowingBoat boat;
	
	public Captain() {
		System.out.println("Captain created");
		boat = new RowingBoat();
	}
	
	public Captain(IRowingBoat boat) {
		this.boat = boat;
	}
	
	public void row() {
		boat.row();
	}
	
	private class RowingBoat implements IRowingBoat {
		
		public void row() {
			System.out.println("Row row row your boat");
		}
		
	}

}
