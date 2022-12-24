package com.nabil.afia.maze;

public interface MazeBuilder {
	public void buildMaze();
	public void creatRoom(int n );
	public void createDoor(int roomN1, int roomN2) ;
	public Maze getMaze();
}
