package com.nabil.afia.maze;

import com.nabil.afia.maze.Room.Direction;

public class MazeGame {
	public MazeGame() {
		// TODO Auto-generated constructor stub
	}
	public Maze creatMazeGame(MazeBuilder b) {
		b.buildMaze();
		b.creatRoom(1);
		b.creatRoom(2);
		b.createDoor(1, 2);
		Maze maze = b.getMaze();
		return maze;
	
	}
}
