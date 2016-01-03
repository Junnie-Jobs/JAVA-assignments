package country;

import org.apache.log4j.Logger;

public class America extends CountryBaisc {

	private static Logger logger = Logger.getLogger(America.class);

	String name = "미국";

	private static America america = new America();

	private America() {
	}

	public static America getInstance() {

		if (america == null) {
			america = new America();
		}
		return america;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가: 미국에서 오토바이를 타고, 사막을 횡단했다.");

	}

	@Override
	public void research() {
		logger.debug("고고학자: 국립공원에서 최근에 발견된 공룡 화석을 살펴보았다.");
	}

	@Override
	public void inspire() {
		logger.debug("예술가: 미국의 수많은 미술관에서 마주한 예술작품 중 가장 인상깊은건 키스해링이었다.");

	}

	@Override
	public String whether() {

		String whether = "미보고";
		return whether;

	}

}
