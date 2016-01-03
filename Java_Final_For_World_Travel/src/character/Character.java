package character;

import ship.TravelInOut;

public class Character extends Thread {

	public static TravelInOut travel = new TravelInOut();

	public void run() {

		try {
			ICharacter character = travel.travelOut();
			sleep(5000);
			travel.returnShip(character);

			if (character == null)
				return;

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
