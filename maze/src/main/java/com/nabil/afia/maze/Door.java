package com.nabil.afia.maze;

public class Door implements MapSite {
	private Room room1;
	private Room room2;
	private boolean isOpen;
	public Door(Room r,Room d1) {
		room1 = r;
		room2 = d1;
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}
	

}
