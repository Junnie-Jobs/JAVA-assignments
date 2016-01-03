package ship;

import java.io.IOException;

import org.apache.log4j.Logger;

import character.Adventurer;
import character.Archeologist;
import character.Artist;
import country.CountryBaisc;

public class RecordTravel {
	private static Logger logger = Logger.getLogger(RecordTravel.class);

	public void recordTravel(Adventurer adventurer, Archeologist archeologist, Artist artist, CountryBaisc i)
			throws IOException {
		WorkInShip threadA = new WorkInShip("모험가");
		WorkInShip threadB = new WorkInShip("고고학자");
		WorkInShip threadC = new WorkInShip("예술가");

		threadA.start();
		threadB.start();
		threadC.start();

		int j;

		logger.debug("세 명의 주인공은 여행기록을 작성해야 합니다.");
		logger.debug("모험가는 A, 고고학자는 B, 예술가는 C를 입력하면 그들의 이야기가 기록됩니다.");
		logger.debug("모두 작성하고 나면 S를 눌러서 다음 행선지로 이동시켜 주세요.");
		logger.debug("");

		while ((j = System.in.read()) != -1) {
			if (j == 'A') {
				i.play(adventurer);
				logger.debug(adventurer + "는 여행기록을 작성하였습니다.");
				threadA.setFlag(true);
			} else if (j == 'B') {
				i.play(archeologist);
				logger.debug(archeologist + "는 여행기록을 작성하였습니다.");
				threadB.setFlag(true);
			} else if (j == 'C') {
				i.play(artist);
				logger.debug(artist + "는 여행기록을 작성하였습니다.");
				threadC.setFlag(true);
			} else if (j == 'S') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}
		}
	}

}
