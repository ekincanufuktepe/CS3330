package edu.mu.adapter;

public class Captain {
	
	private IRowingBoat rowingBoat;
	
	public Captain() {
		this.rowingBoat = new RowingBoat();
	}
	
	public Captain(IRowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}
	
	public void row() {
		rowingBoat.row();
	}
	
	private class RowingBoat implements IRowingBoat {

		@Override
		public void row() {
			System.out.println("Rowing my tiny boat...");
		}
		
	}

}
