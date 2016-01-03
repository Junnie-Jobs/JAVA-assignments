package test;

import java.io.IOException;

import org.apache.log4j.Logger;

import character.Adventurer;
import character.Archeologist;
import character.Artist;
import departure.Departure;

public class WorldTravelTest {
	
	private static Logger logger = Logger.getLogger(WorldTravelTest.class);

	public static void main(String[] args) throws IOException, InterruptedException {

		Departure departure = new Departure();
		departure.timeCheck();
		logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Adventurer adventurer = Adventurer.getInstance();
		Archeologist archeologist = Archeologist.getInstance();
		Artist artist = Artist.getInstance();

		adventurer.introduce();
		archeologist.introduce();
		artist.introduce();
		logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		departure.countryCheck();

	}

}
