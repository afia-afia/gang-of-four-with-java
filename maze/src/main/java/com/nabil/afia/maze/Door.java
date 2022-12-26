package com.nabil.afia.maze;

public class Door implements MapSite {
	private Room room1;
	private Room room2;
	private boolean isOpen;
	public Door(Room r,Room d1) {
		room1 = r;
		room2 = d1;
	}
	public Door(Door d) {
		room1 = d.room1;
		room2 = d.room2;
	}
	public Door() {
		// TODO Auto-generated constructor stub
	}
	public Door clone() {
		return new Door(this);
	}
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}

	public void initialize(Room r1, Room r2) {
		// TODO Auto-generated method stub
		this.room1 = r1;
		this.room2 = r2;
		
	}
	

}
