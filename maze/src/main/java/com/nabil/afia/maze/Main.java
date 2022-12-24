package com.nabil.afia.maze;

public class Main {
	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		MazeBuilder mazeBuilder = new StandarMazeBuilder();
		Maze maze = game.creatMazeGame(mazeBuilder);
		maze.displayMaze();
	}
}
