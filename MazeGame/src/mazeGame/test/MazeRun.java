package mazeGame.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import mazeGame.Player;
import mazeGame.maze.Strategy;
import mazeGame.maze.Strategy4;
import mazeGame.maze.Strategy8;

public class MazeRun {

	
	public static void main(String[] args) throws IOException {
		
		Strategy strategies[] = new Strategy[2];
		strategies[0] = new Strategy4();
		strategies[1] = new Strategy8();
		
		String path = MazeRun.class.getResource("").getPath();
		Properties properties = new Properties();
		properties.load(new FileInputStream(path+"config.properties"));
		String direction = properties.getProperty("direction");
		System.out.println("direction: "+ direction);
		
		
		Player player = null;
		if(direction.equals("4"))
			player = new Player(strategies[0]);
		else if(direction.equals("8"))
			player = new Player(strategies[1]);
		
		player.searchPath();
		player.printPath();
		
	}
}
