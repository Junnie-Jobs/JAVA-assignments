package country;

import org.apache.log4j.Logger;

import character.Adventurer;
import character.Archeologist;
import character.Artist;
import character.ICharacter;

public abstract class CountryBaisc {
	
	private static Logger logger = Logger.getLogger(CountryBaisc.class);

	public abstract void adventure();

	public abstract void research();

	public abstract void inspire();
	
	public abstract String whether();

	public void play(ICharacter chracter) {

		Adventurer adventurer = Adventurer.getInstance();
		Archeologist archeologist = Archeologist.getInstance();
		Artist artist = Artist.getInstance();

		if (chracter == adventurer)
			adventure();
		else if (chracter == archeologist)
			research();
		else if(chracter == artist)
			inspire();
		else
			logger.debug("캐릭터를 잘못 입력하셨습니다.");
			

	}

}
