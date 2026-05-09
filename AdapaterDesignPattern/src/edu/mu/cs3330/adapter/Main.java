package edu.mu.cs3330.adapter;

import edu.mu.cs3330.adapter.boat.SailBoatAdapter;
import edu.mu.cs3330.adapter.boat.YachtAdapter;
import edu.mu.cs3330.adapter.captain.Captain;

public class Main {

	public static void main(String[] args) {
		Captain cap = new Captain();
		cap.row();
		
		cap = new Captain(new SailBoatAdapter());
		cap.row();
		
		cap = new Captain(new YachtAdapter());
		cap.row();
	}

}
