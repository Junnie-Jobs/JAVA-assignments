package strategy;

import java.util.ArrayList;

import maze.MakeMaze;
import maze.ViewMaze;
import stack.Coordinates;
import stack.CoordinatesStack;

public class Player extends CoordinatesStack implements IStrategy {

	private int stackCount = 1;
	private int[][] maze = new MakeMaze().getMaze();
	private ArrayList<Coordinates> coordinatesStack = super.getCoordinatesStack();
	private int top = super.getTop();

	@Override
	public boolean checkWall(int x, int y) {

		return (x >= maze.length || y >= maze.length || x < 0 || y < 0 || maze[x][y] == 1);
		
	}

	@Override
	public boolean isExit(int x, int y) {
		return (x == maze.length - 1 && y == maze[0].length - 2);
	}

	@Override
	public boolean checkNewPath(int x, int y) {
		for (Coordinates c : coordinatesStack) {
			if (x == c.getX() && y == c.getY()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Coordinates findPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move(int x, int y) {
		push(x, y);
		stackCount++;

	}

	@Override
	public void moveBack() {
		pop();
		stackCount--;
	}

	@Override
	public int getStrackCount() {

		return stackCount;
	}

	@Override
	public void exit() {
		for(Coordinates c: coordinatesStack){
			maze[c.getX()][c.getY()]=2;
		}

	}

	@Override
	public void playMaze() {
		top = super.getTop();
		int currentX = coordinatesStack.get(top).getX();
		int currentY = coordinatesStack.get(top).getY();
		Coordinates coordinates = findPath();
		
		while(isExit(currentX, currentY) == false){
			if(coordinates == null){
				moveBack();
				top=super.getTop();
				currentX = coordinatesStack.get(top).getX();
				currentY = coordinatesStack.get(top).getY();
				coordinates  = findPath();
				coordinatesStack.remove(top+1);
			}else{
				move(coordinates.getX(), coordinates.getY());
				top=super.getTop();
				currentX=coordinatesStack.get(top).getX();
				currentY=coordinatesStack.get(top).getY();
				coordinates = findPath();
			}
		}
		
		exit();
		ViewMaze view = new ViewMaze(maze);
		view.viewMazePath();

	}

}
