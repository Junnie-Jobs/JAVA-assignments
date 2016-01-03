package clothesDecorator;

import org.apache.log4j.Logger;
import country.CountryBaisc;

public class ClothesChoice {
	
	private static Logger logger = Logger.getLogger(ClothesChoice.class);

	public void clothesChoice(CountryBaisc i) {

		if (i.whether() == "무더위") {
			logger.debug("여행자들은 ");
			Tshirt tshirt = new Tshirt();
			tshirt.wearing();
			logger.debug("를 착용하였다.");
		} else if (i.whether() == "따뜻함") {
			logger.debug("여행자들은 ");
			Cardigan cardigan = new Cardigan(new Tshirt());
			cardigan.wearing();
			logger.debug("을 착용하였다.");
		} else if (i.whether() == "선선함") {
			logger.debug("여행자들은 ");
			ThinCoat thinCoat = new ThinCoat(new Cardigan(new Tshirt()));
			thinCoat.wearing();
			logger.debug("를 착용하였다.");
		} else if (i.whether() == "강추위") {
			logger.debug("여행자들은 ");
			ThickCoat thickCoat = new ThickCoat(new ThinCoat(new Cardigan(new Tshirt())));
			thickCoat.wearing();
			logger.debug("를 착용하였다.");
		} else {
			logger.debug("예측되지 않은 날씨가 기록되어있습니다. 승객여러분은 필요한 옷가지를 모두 챙겨서 여행을 다녀와 주세요");
		}
		logger.debug("");
	}

}
