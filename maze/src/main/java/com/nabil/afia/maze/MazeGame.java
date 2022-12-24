package com.nabil.afia.maze;

import com.nabil.afia.maze.Room.Direction;

public class MazeGame {
	public MazeGame() {
		// TODO Auto-generated constructor stub
	}
	public Maze creatMazeGame(MazeFactory f) {
		Maze aMaze = f.createMaze();
		Room r1 = f.makeRoom(1);
		Room r2 = f.makeRoom(2);
		Door door  = f.makeDoor(r1, r2);
		aMaze.addRoom(r1);
		aMaze.addRoom(r2);
		r1.setDirection(Direction.NORTH,f.createWall());
		r1.setDirection(Direction.EAST,door);
		r1.setDirection(Direction.WEST,f.createWall());
		r1.setDirection(Direction.SOUTH,f.createWall());
		r2.setDirection(Direction.NORTH,door);
		r2.setDirection(Direction.EAST,f.createWall());
		r2.setDirection(Direction.WEST,f.createWall());
		r2.setDirection(Direction.SOUTH,f.createWall());
		return aMaze;
	}
}
