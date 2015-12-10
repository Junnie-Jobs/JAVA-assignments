package mazeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import strategy.Player;
import strategy.Strategy4;
import strategy.Strategy8;

public class MazeTest {

	public static void main(String[] args) {

		Player player = new Player();

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("Strategy.properties"); 
															
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String dirOption = property.getProperty("Direction"); 
		if (dirOption.equals("4")) { 
			player = new Strategy4();
		} else if (dirOption.equals("8")) { 
			player = new Strategy8();
		} else {
			System.out.println("Direction Option error");
			return;
		}
		
		System.out.println("<" + dirOption + " direction maze run>\n");
		player.playMaze();
		System.out.println("Stack count: " + player.getStrackCount());
																	
	}

}
