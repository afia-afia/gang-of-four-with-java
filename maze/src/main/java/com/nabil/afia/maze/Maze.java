package com.nabil.afia.maze;

import java.util.ArrayList;
import java.util.Iterator;

public class Maze {
	private ArrayList<Room> maze = new ArrayList<>();
	public void addRoom(Room r) {
		maze.add(r);
	}
	public Room getRoomByNumber(int x) {
		for (Room room : maze) {
			if (room.getNumberOfRoom() == x) {
				return room;
			}
		}
		return null;
	}
	public void displayMaze() {
		for (Room room : maze) {
			room.displayRomm();
		}
	}
}
