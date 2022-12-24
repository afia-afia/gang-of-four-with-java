package com.nabil.afia.maze;

import com.nabil.afia.maze.Room.Direction;

public class StandarMazeBuilder implements MazeBuilder{
	private Maze maze;
	@Override
	public void buildMaze() {
			this.maze = new Maze();
			}
	@Override
	public void createDoor(int roomN1, int roomN2) {
		Room r1 = maze.getRoomByNumber(roomN1);
		Room r2 = maze.getRoomByNumber(roomN2);
		Door door = new Door(r1, r2);
		r1.setDirection(commonWall(r1, r2), door);
		r2.setDirection(commonWall(r2, r1), door);
		
			
	}
	@Override
	public void creatRoom(int n) {
			if(maze.getRoomByNumber(n) == null) {
				Room room = new Room(n);
				maze.addRoom(room);
				room.setDirection(Direction.WEST,new Wall());
				room.setDirection(Direction.EAST,new Wall());
				room.setDirection(Direction.NORTH,new Wall());
				room.setDirection(Direction.SOUTH,new Wall());
			}
	}
	@Override
	public Maze getMaze() {
		
		return maze;
	}
	public StandarMazeBuilder() {
		maze = null;
	}
	public Direction commonWall(Room r1, Room r2) {
		// this function return the direction of common relatively to r1
		System.out.println(r1.getNumberOfRoom());
		if(r1.getNumberOfRoom() == r2.getNumberOfRoom()-1) {
			return Direction.WEST;
		}
		else if (r1.getNumberOfRoom() == r2.getNumberOfRoom()+1) {
			return Direction.EAST;
		}
		return null;
		}

}
