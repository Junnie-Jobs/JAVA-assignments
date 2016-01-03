package countryStrategy;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import character.Adventurer;
import character.Archeologist;
import character.Artist;
import character.Character;
import clothesDecorator.ClothesChoice;
import country.America;
import country.Brazil;
import country.CountryBaisc;
import country.Greece;
import country.Peru;
import country.Yemen;
import ship.RecordTravel;

public class CountryFor10 {

	private static Logger logger = Logger.getLogger(CountryFor10.class);
	
	CountryFor5 countryFor5 = new CountryFor5();

	public ArrayList<CountryBaisc> addCountry() {

		countryFor5.addCountry();
		countryFor5.getList();
		countryFor5.getList().add(Yemen.getInstance());
		countryFor5.getList().add(Greece.getInstance());
		countryFor5.getList().add(Peru.getInstance());
		countryFor5.getList().add(Brazil.getInstance());
		countryFor5.getList().add(America.getInstance());

		return countryFor5.getList();

	}

	// public ArrayList<CountryBaisc> getList() {
	//
	// return countryList;
	//
	// }

	public void printCountry() {

		for (CountryBaisc i : countryFor5.getList()) {
			System.out.print(i + " ");
		}
		logger.debug("");

	}

	public void travel() throws InterruptedException, IOException {

		Adventurer adventurer = Adventurer.getInstance();
		Archeologist archeologist = Archeologist.getInstance();
		Artist artist = Artist.getInstance();
		
		RecordTravel rt = new RecordTravel();
		ClothesChoice cc = new ClothesChoice();
		
		int num = 1;

		for (CountryBaisc i : countryFor5.getList()) {
			logger.debug("빵~빵~ 기적소리가 들려온다.");
			logger.debug("승객여러분이 " + num + "번째 방문하실 나라는 [" + i + "] 입니다.");
			logger.debug("");
			logger.debug("현재 기항하는 " + i + "의 날씨는 " + i.whether() + "입니다.");
			logger.debug("승객여러분은 날씨에 알맞는 복장을 착용하시길 바랍니다");

			logger.debug("");
			logger.debug("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			cc.clothesChoice(i);
			logger.debug("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			logger.debug("");
			logger.debug("여행자들이 기항지에 여행을 갔다가 돌아올 때까지 기다려 주세요");
			logger.debug("");

			Character c1 = new Character();
			Character c2 = new Character();
			Character c3 = new Character();

			c1.start();
			c2.start();
			c3.start();
			c1.join();
			c2.join();
			c3.join();


			logger.debug("");
			logger.debug("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			rt.recordTravel(adventurer, archeologist, artist, i);
			num++;
			if (num <= countryFor5.getList().size()) {
				logger.debug("");
				logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				logger.debug("배가 다음 목적지에 가기 위해 항해중입니다.");
				logger.debug("             _~");
				logger.debug("          _~ )_)_~");
				logger.debug("          )_))_))_)");
				logger.debug("         \\_!__!__!_/");
				logger.debug("          \\_______/");
				logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				logger.debug("");
				
				
			} else {
				logger.debug("");
				logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				logger.debug("");
				logger.debug("세계일주가 끝났습니다. 하지만 여행은 끝나지 않았습니다. 여러분의 가슴과 머리속에");
				logger.debug("영원히 살아 숨쉴 것이고, 그 경험이 여러분을 성장시켜줄 것입니다.");
				logger.debug("세계일주 첫번째 이야기 끝.");
				logger.debug("");
				logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			}

		}

	}

}
