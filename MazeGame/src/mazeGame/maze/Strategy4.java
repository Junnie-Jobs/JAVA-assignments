package mazeGame.maze;

public class Strategy4 implements Strategy {

	@Override
	public Point getNextPos(Point curPos) {

		Point nextPos = new Point();
		switch (curPos.nextDir) {

		case 0:
			curPos.nextDir = -1; // 백하
			break;

		case 1:
			nextPos.x = curPos.x; // 북쪽이동
			nextPos.y = curPos.y+1;
			curPos.nextDir++;
			break;

		case 2:
			nextPos.x = curPos.x+1; // 동쪽이동
			nextPos.y = curPos.y;
			curPos.nextDir++;

			break;

		case 3:
			nextPos.x = curPos.x; // 남쪽이동
			nextPos.y = curPos.y - 1;
			curPos.nextDir++;
			break;

		case 4:
			nextPos.x = curPos.x-1; //서쪽이동
			nextPos.y = curPos.y;
			curPos.nextDir++;
			break;

		}
		return nextPos;
	}
}
