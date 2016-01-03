package countryStrategy;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import character.Adventurer;
import character.Archeologist;
import character.Artist;
import character.ThreadCharacter;
import clothesDecorator.ClothesChoice;
import country.Austrailia;
import country.CountryBaisc;
import country.Nepal;
import ship.RecordTravel;

public class CountryFor5 {
	
	private static Logger logger = Logger.getLogger(CountryFor5.class);

	CountryFor3 countryFor3 = new CountryFor3();

	public ArrayList<CountryBaisc> addCountry() {

		countryFor3.addCountry();
		countryFor3.getList().add(Nepal.getInstance());
		countryFor3.getList().add(Austrailia.getInstance());

		return countryFor3.getList();
	}

	public ArrayList<CountryBaisc> getList() {

		return countryFor3.getList();
	}

	public void printCountry() {

		for (CountryBaisc i : countryFor3.getList()) {
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

		for (CountryBaisc i : countryFor3.getList()) {

			logger.debug("빵~빵~ 기적소리가 들려온다.");
			logger.debug("승객여러분이 " + num + "번째 방문하실 나라는 [" + i + "] 입니다.");
			logger.debug("");
			logger.debug("현재 기항하는 " + i + "의 날씨는 " + i.whether() + "입니다.");
			logger.debug("승객여러분은 날씨에 알맞는 복장을 착용하시길 바랍니다");

			logger.debug("");
			logger.debug("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			logger.debug("");
			cc.clothesChoice(i);
			logger.debug("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			logger.debug("");
			logger.debug("여행자들이 기항지에 여행을 갔다가 돌아올 때까지 기다려 주세요");
			logger.debug("");

			ThreadCharacter c1 = new ThreadCharacter();
			ThreadCharacter c2 = new ThreadCharacter();
			ThreadCharacter c3 = new ThreadCharacter();

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

			if (num <= countryFor3.getList().size()) {
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
				logger.debug("여행을 통해 배우는 것은 단지 세상의 다른 모습 뿐만 아니라 세계를 이끌어온 인류의 정신의 역사와");
				logger.debug("그 문명을 일구어온 태도에 대해 배우고 그것들을 몸에 녹아내리는 것입니다.");
				logger.debug("여행지에서 각자가 얻은 메시지, 깨달음의 과정 속에서 있었던 감각적 사유와 이성적 사색의 여정. 그리고 성장...");
				logger.debug("여행은 이토록 우리에게 특별한 경험을 선사해주고, 앞으로 살아갈 세상에 대한 인식과 무대를 넓혀줄 것입니다.");
				logger.debug("잊지마세요. 인생의 여행은 계속 된다는 것을.");
				logger.debug("세계일주 첫번째 이야기 끝.");
				logger.debug("");
				logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			}

		}

	}

}
