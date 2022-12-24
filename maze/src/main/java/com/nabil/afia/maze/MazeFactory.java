package com.nabil.afia.maze;

public class MazeFactory {
	public MazeFactory() {
		// TODO Auto-generated constructor stub
	}
	public Maze createMaze() {
		return new Maze();
	}
	public Wall createWall() {
		return new Wall();
	}
	public Room makeRoom(int n) {
		return new Room(n);
	}
	public Door makeDoor(Room r1,Room r2) {
		return new Door(r1, r2);
	}
}
