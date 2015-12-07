package strategy;

import stack.Coordinates;

public interface IStrategy {
	
	boolean checkWall(int x, int y);
	boolean isExit(int x, int y);
	boolean checkNewPath(int x, int y);
	Coordinates findPath();
	void move(int x,int y);
	void moveBack();
	int getStrackCount();
	void exit();
	void playMaze();
	
	
	

}
