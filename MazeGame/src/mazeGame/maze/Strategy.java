package mazeGame.maze;

public interface Strategy {
	
	//맵에서 현재의 좌표를 가져오고, 다음좌표의 위치를 리턴한다.
	public Point getNextPos(Point curPos);

}
