package com.nabil.afia.maze;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.attribute.standard.NumberOfDocuments;

public class Room implements MapSite{
	public enum Direction{EAST,WEST,NORTH,SOUTH	}
	private int numberOfRoomm ;
	private HashMap<Direction, MapSite> sides = new HashMap<>();
	public Room(int x) {
		numberOfRoomm = x;
	}
	public void getSide(Direction direction ) {
		sides.get(direction);
		
	}
	public void setDirection(Direction d, MapSite m) {
		sides.put(d, m);
		
	}
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}
	public int getNumberOfRoom() {
		return this.numberOfRoomm;
		
	}
	public void displayRomm() {
		for (Entry<Direction, MapSite> entry : sides.entrySet()) {
			Direction key = entry.getKey();
			MapSite val = entry.getValue();
			System.out.println("this the room number: " + numberOfRoomm);
			if (val.getClass().equals(Wall.class)) {
				System.out.println(key + ": " + "Wall");
			}
			if (val.getClass().equals(Door.class)) {
				System.out.println(key + ": " + "DOOR");	
			}
		}
	}
}
