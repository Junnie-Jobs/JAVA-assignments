package departure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.log4j.Logger;
import countryStrategy.CountryFor10;
import countryStrategy.CountryFor3;
import countryStrategy.CountryFor5;


public class Departure {

	private static Logger logger = Logger.getLogger(Departure.class);

	public Departure() {

	}

	public void timeCheck() {

		Date time = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd E");
		SimpleDateFormat sdf2 = new SimpleDateFormat("a.hh''mm '분'");
		logger.debug("현재 오늘 날짜는: " + sdf1.format(time) + "요일입니다.");
		logger.debug("세계일주 출항이 " + sdf2.format(time) + "에 시작되었습니다.	");
		logger.debug("승객여러분은 파도로 인한 흔들림에 주의해 주십시요");
		logger.debug("╭╯╭╯╭╯╭╯╭╯╭╯╭╯╭╯╭╯╭╯╭╯╭╯");
	}

	public void countryCheck() throws IOException, InterruptedException {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("Country.properties");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String CountryOption = property.getProperty("Country");
		if (CountryOption.equals("3")) {
			logger.debug("");
			logger.debug("이번 항해에서는 아래의 3개 국가에 기항합니다.");
			CountryFor3 countryStratey = new CountryFor3();
			countryStratey.addCountry();
			countryStratey.printCountry();
			logger.debug("");
			logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			logger.debug("배가 세계일주를 떠나기 위해 출항합니다.");
			logger.debug("             _~");
			logger.debug("          _~ )_)_~");
			logger.debug("          )_))_))_)");
			logger.debug("         \\_!__!__!_/");
			logger.debug("          \\_______/");
			logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			logger.debug("");
			countryStratey.travel();

		} else if (CountryOption.equals("5")) {
			logger.debug("");
			logger.debug("이번 항해에서는 아래의 5개 국가에 기항합니다..");
			CountryFor5 countryStratey = new CountryFor5();
			countryStratey.addCountry();
			countryStratey.printCountry();
			logger.debug("");
			logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			logger.debug("배가 세계일주를 떠나기 위해 출항합니다.");
			logger.debug("             _~");
			logger.debug("          _~ )_)_~");
			logger.debug("          )_))_))_)");
			logger.debug("         \\_!__!__!_/");
			logger.debug("          \\_______/");
			logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			logger.debug("");
			countryStratey.travel();
		}

		else if (CountryOption.equals("10")) {

			logger.debug("이번 항해에서는 아래의 10개 국가에 기항합니다.");
			CountryFor10 countryStratey = new CountryFor10();
			countryStratey.addCountry();
			countryStratey.printCountry();
			logger.debug("");
			logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			logger.debug("배가 세계일주를 떠나기 위해 출항합니다.");
			logger.debug("             _~");
			logger.debug("          _~ )_)_~");
			logger.debug("          )_))_))_)");
			logger.debug("         \\_!__!__!_/");
			logger.debug("          \\_______/");
			logger.debug("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			logger.debug("");
			countryStratey.travel();

		} else {

			logger.debug("이번 항해에서 선택할 수 있는 국가의 수는 3,5,10개 입니다.");
			logger.debug("다시 선택해 주세요");
			return;
		}

	}

}
