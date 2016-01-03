package character;

import org.apache.log4j.Logger;


public class Adventurer extends Thread implements ICharacter {
	
	private static Logger logger = Logger.getLogger(Adventurer.class);
	
	String name="모험가";

	private static Adventurer adventurer = new Adventurer();

	private Adventurer() {
		
	}

	public static Adventurer getInstance() {

		if (adventurer == null) {
			adventurer = new Adventurer();
		}
		return adventurer;
	}
	public String toString(){
		return this.name;
	}

	@Override
	public void introduce() {
		logger.debug("나는 모험가, 세계일주를 하며 온갖 모험에 도전해 볼 것이다.");
		
	}
	
}
