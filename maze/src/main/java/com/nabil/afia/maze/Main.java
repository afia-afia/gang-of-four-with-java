package com.nabil.afia.maze;

public class Main {
	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		MazeFactory factory = new MazeFactory();
		Maze maze = game.creatMazeGame(factory);
		maze.displayMaze();
	}
}
