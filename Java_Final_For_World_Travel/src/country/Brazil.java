package country;

import org.apache.log4j.Logger;

public class Brazil extends CountryBaisc {
	
	private static Logger logger = Logger.getLogger(Brazil.class);

	String name = "브라질";

	private static Brazil brazil = new Brazil();

	private Brazil() {
	}

	public static Brazil getInstance() {

		if (brazil == null) {
			brazil = new Brazil();
		}
		return brazil;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가: 브라질의 아마존에서 죽음의 마라톤을 경험했다. ");

	}

	@Override
	public void research() {
		logger.debug("고고학자: 브라질의 리우 예수 동상에는 그 거대한 앞모습만을 사람들이 보지만, 뒷모습에 그 고단한 역사의 결이 숨겨져 있는 걸 확인할 수 있었다.");

	}

	@Override
	public void inspire() {
		logger.debug("예술가: 브라질의 예술거리 엠부다스아르찌에서 라틴의 역동적인 모습이 깃든 작품들을 경험할 수 있었다.");

	}

	@Override
	public String whether() {

		String whether = "무더위";
		return whether;

	}

}
