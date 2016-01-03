package character;

import org.apache.log4j.Logger;



public class Artist extends Thread implements ICharacter {
	
	private static Logger logger = Logger.getLogger(Artist.class);

	String name = "예술가";

	private static Artist artist = new Artist();

	private Artist() {

	}

	public String toString() {
		return this.name;
	}

	public static Artist getInstance() {

		if (artist == null) {
			artist = new Artist();
		}
		return artist;
	}

	public void Explore() {
		// TODO Auto-generated method stub

	}

	public void introduce() {
		logger.debug("나는 예술가, 세상의 모든 영감을 얻어갈 것이다.");

	}

//	public void run(){
//		
//		
//		
//		try {
//			ICharacter character = TravelCountry.travel.travelOut();
//			sleep(5000);
//			TravelCountry.travel.returnShip(character);
//
//			if (character == null)
//				return;
//
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}

