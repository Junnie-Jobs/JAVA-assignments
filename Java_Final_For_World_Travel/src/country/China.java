package country;

import org.apache.log4j.Logger;

public class China extends CountryBaisc {
	
	private static Logger logger = Logger.getLogger(China.class);

	String name = "중국";

	private static China china = new China();

	private China() {
	}

	public static China getInstance() {

		if (china == null) {
			china = new China();
		}
		return china;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가:중국에서 차마고도를 넘는 흥미진진한 투어를 경험했다!");

	}

	@Override
	public void research() {
		logger.debug("고고학자:영혼들이 아직도 대화를 걸어오는 진시황릉의 유적가...평생 잊지 못할 것이다.");

	}

	@Override
	public void inspire() {
		logger.debug("예술가:아바타의 배경이 된 장가계는 이미 인간의 영역이 아니었다.");

	}

	@Override
	public String whether() {

		String whether = "미보고";
		return whether;

	}

}
