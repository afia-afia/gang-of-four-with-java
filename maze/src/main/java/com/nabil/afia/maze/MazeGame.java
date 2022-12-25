package com.nabil.afia.maze;

import com.nabil.afia.maze.Room.Direction;

public class MazeGame {
	public MazeGame() {
		// TODO Auto-generated constructor stub
	}
	public Maze makeMaze() {
		return new Maze();
	}
	public Room makeRoom(int n) {
		return new Room(n);
	}
	public Wall makeWall() {
		return new Wall();
	}
	public Door makeDoor(Room room ,Room room2) {
		return new Door(room, room2);
	}
	public Maze creatMazeGame() {
		Maze maze = makeMaze();
		Room room = makeRoom(1);
		Room room2 = makeRoom(2);
		Door theDoor = makeDoor(room, room2);
		maze.addRoom(room);
		maze.addRoom(room2);
		room.setDirection(Direction.NORTH, makeWall());
		room.setDirection(Direction.SOUTH, makeWall());
		room.setDirection(Direction.WEST, makeWall());
		room.setDirection(Direction.EAST, theDoor);
		
		room2.setDirection(Direction.NORTH, makeWall());
		room2.setDirection(Direction.SOUTH, makeWall());
		room2.setDirection(Direction.WEST, theDoor);
		room2.setDirection(Direction.EAST, makeWall());
		return maze;
		
	}
}
