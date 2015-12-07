package strategy;

import java.util.ArrayList;

import stack.Coordinates;

public class Strategy8 extends Player{
	
	private ArrayList<Coordinates> coordinatesStack = super.getCoordinatesStack();
	private int top = super.getTop();

	@Override
	public Coordinates findPath() {

		int[][] moveDir4 = { {-1,1}, {1,-1}, {1,1}, {-1,-1},{0,1},{1,0},{0,-1},{-1,0} };
		top = super.getTop();
		int currentX = coordinatesStack.get(top).getX();
		int currentY = coordinatesStack.get(top).getY();

		for (int i = 0; i < moveDir4.length; i++) {

			int moveX = currentX + moveDir4[i][0];
			int moveY = currentY + moveDir4[i][1];

			if (checkWall(moveX, moveY)) {
				continue;
			} else {
				if (checkNewPath(moveX, moveY)) {
					return (new Coordinates(moveX, moveY));
				}
			}

		}
		return null;
	}

}


