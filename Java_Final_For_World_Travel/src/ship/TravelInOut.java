package ship;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import character.Adventurer;
import character.Archeologist;
import character.Artist;
import character.ICharacter;

public class TravelInOut {
	
	private static Logger logger = Logger.getLogger(TravelInOut.class);
	
	public ArrayList<ICharacter> characters = new ArrayList<ICharacter>();

	Adventurer adventurer = Adventurer.getInstance();
	Archeologist archeologist = Archeologist.getInstance();
	Artist artist = Artist.getInstance();
	
	public TravelInOut() {
		characters.add(adventurer);
		characters.add(archeologist);
		characters.add(artist);
	}

	public ArrayList<ICharacter> getList() {

		return characters;
	}

	public synchronized ICharacter travelOut() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		ICharacter character = characters.remove(0);
		logger.debug(character + "는 기항지로 여행을 떠났습니다. ");
		return character;
	}

	public synchronized void returnShip(ICharacter character) {
		
		Thread t = Thread.currentThread();
		logger.debug(character + "가 함선으로 돌아왔습니다. ");
		characters.add(character);

	}

}
