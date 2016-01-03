package country;

import org.apache.log4j.Logger;

public class Nepal extends CountryBaisc {
	
	private static Logger logger = Logger.getLogger(Nepal.class);

	String name = "네팔";

	private static Nepal nepal = new Nepal();

	private Nepal() {
	}

	public static Nepal getInstance() {

		if (nepal == null) {
			nepal = new Nepal();
		}
		return nepal;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가: 네팔에서 경험한 히말라야 트래킹. 산소가 부족했기에 고산증에 시달렸지만, 부족한 곳에서만 볼 수 있던 그 설경은 잊지 못할 것이다. ");

	}

	@Override
	public void research() {
		logger.debug("고고학자: 네팔의 카트만두에서는 종교가 시간의 흐름 속에서 인간의 생활양식에 어떻게 녹아들 수 있는지, 기독교와는 다른 동양의 가치를 보여주고 있었다.");
	}

	@Override
	public void inspire() {
		logger.debug("예술가: 네팔의 조각 예술품들은 종교적 대상을 기리기 위한 그 마음이 동작과 손동작의 섬세함에 그대로 녹아들어 있었다. 자세히 살펴볼수록 마치 움직이는 것 같았다.");
	}

	@Override
	public String whether() {

		String whether = "강추위";
		return whether;

	}

}
