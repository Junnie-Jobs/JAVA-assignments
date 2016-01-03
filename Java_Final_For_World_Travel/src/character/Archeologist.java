package character;

import org.apache.log4j.Logger;



public class Archeologist extends Thread implements ICharacter {
	
	private static Logger logger = Logger.getLogger(Archeologist.class);

	String name = "고고학자";

	private static Archeologist archeologist = new Archeologist();

	private Archeologist() {

	}

	public static Archeologist getInstance() {

		if (archeologist == null) {
			archeologist = new Archeologist();
		}
		return archeologist;
	}

	public String toString() {
		return this.name;
	}

	@Override
	public void introduce() {
		logger.debug("나는 고고학자, 전 세계의 유적들을 살펴볼 것이다.");

	}

}
