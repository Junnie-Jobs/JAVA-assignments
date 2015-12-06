package mazeGame;

import java.util.ArrayList;

import mazeGame.maze.Map;
import mazeGame.maze.Point;
import mazeGame.maze.Strategy;

public class Player {

	private ArrayList<Point> path = new ArrayList<Point>();
	private Map map;
	private int movedPoints[][];
	private Strategy strategy;
	private int mazeSize;

	public Player(Strategy strategy) {

		this.strategy = strategy;
		map = new Map();
		mazeSize = map.getMapSize();
		map.setMaze();
		movedPoints = new int[mazeSize][mazeSize];
	}

	public ArrayList<Point> searchPath() {

		Point curPos = new Point();
		Point nextPos = null;
		curPos.x = 0;
		curPos.y = 0;

		// 출구에 도착할때까지 이동
		while (!map.isExit(curPos)) {
			// get next Direction

			// get next direction
			do {
				nextPos = strategy.getNextPos(curPos);
			} while (!rangeForMove(nextPos) && curPos.nextDir != -1);

			if (curPos.nextDir == -1) {

				curPos = path.get(path.size() - 1); // 이전 좌표로 돌아감
				path.remove(path.size() - 1); //
				continue;
			}

			path.add(curPos);
			movedPoints[curPos.x][curPos.y] = 1;
			curPos = nextPos;

		}
	
	path.add(curPos);
	System.out.println("Found Path!\n");
	return path;

	}


	private boolean rangeForMove(Point point) {

		if (point.x < 0 || point.x >= mazeSize || point.y < 0 || point.y >= mazeSize)
			return false;

		// already in the path
		if (movedPoints[point.y][point.x] == 1)
			return false;

		if (map.getWallPos(point) == 1)
			return false;

		return true;
	}

	public void printPath() {

		System.out.println("길에 쓰인 숫자는 시계방향으로 위쪽을 0으로 하는 방향을 나타내며, 다음 이동 위치를 나타냅니다.");
		System.out.println("ㅁ는 벽을 나타내며, @는 미로를 탈출하는데 필요치 않은 경로를 나타냅니다.");
		String result[][] = new String[mazeSize][mazeSize];

		for (int i = 0; i < mazeSize; i++) {
			for (int j = 0; j < mazeSize; j++) {
				Point pos = new Point();
				pos.x = i;
				pos.y = j;

				if (map.getWallPos(pos) == 1)
					result[i][j] = "ㅁ";
				if (map.getWallPos(pos) == 0)
					result[i][j] = "@";
			}
		}

		for (int i = 0; i < path.size(); i++) {

			Point pos = path.get(i);

			if (i == 0)
				result[pos.x][pos.y] = "S";
			else if (i == path.size() - 1)
				result[pos.x][pos.y] = "E";
			else
				result[pos.x][pos.y] = Integer.toString(pos.nextDir - 1);
		}

		for (int i = 0; i < mazeSize; i++) {

			System.out.println();
			for (int j = 0; j < mazeSize; j++) {
				System.out.println(result[i][j] + " ");
			}

		}

	}

}
