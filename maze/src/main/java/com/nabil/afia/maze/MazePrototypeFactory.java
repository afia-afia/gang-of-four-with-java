package com.nabil.afia.maze;

public class MazePrototypeFactory extends MazeFactory{
	private Room room;
	private Wall wall;
	private Maze maze;
	private Door door;
	public MazePrototypeFactory(Maze m,Wall w,Door d,Room r) {
		room = r;
		maze = m;
		wall = w;
		door = d;
		
	}
	public Maze makeMaze() {
		return maze.clone();
	}
	public Room makeRoom(int n ) {
		Room room = this.room.clone();
		room.initialize(n);
		return room;
	}
	public Wall makeWall() {
		return wall.clone();
	}
	public Door makeDoor(Room r1,Room r2) {
		Door door = this.door.clone();
		door.initialize(r1,r2);
		return door;
	}
}
