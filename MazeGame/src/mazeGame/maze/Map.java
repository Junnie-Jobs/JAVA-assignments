package mazeGame.maze;

public class Map {

	private int[][] map;

	public int getWallPos(Point pos) {
		return map[pos.y][pos.x];
	}

	public boolean isExit(Point pos) {
		if (pos.x == 7 && pos.y == 7)
			return true;
		return false;
	}

	public void setMaze() {

		int[][] map = {

				{ 0, 1, 1, 1, 0, 1, 1, 1 }, 
				{ 0, 0, 0, 1, 0, 0, 0, 0 }, 
				{ 1, 1, 0, 0, 0, 1, 0, 1 },
				{ 1, 1, 0, 1, 1, 1, 0, 1 }, 
				{ 1, 0, 0, 1, 0, 0, 0, 0 }, 
				{ 0, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 0, 1, 1, 0, 0, 0, 0 }, 
				{ 0, 1, 1, 0, 1, 1, 1, 0 } 
			};
	}

	public int getMapSize() {
		return map.length;
	}
}
