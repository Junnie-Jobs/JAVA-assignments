package country;

import org.apache.log4j.Logger;

public class Japan extends CountryBaisc {
	
	private static Logger logger = Logger.getLogger(Japan.class);

	String name = "일본";

	private static Japan japan = new Japan();

	private Japan() {

	}

	public static Japan getInstance() {

		if (japan == null) {
			japan = new Japan();
		}
		return japan;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가:일본에서 2차세계대전 당시 침몰한 일본군함들이 있는 팔라완 코론에서 정지된 시간속의 배들의 모습을 보는 스쿠버다이빙을 하다.");

	}

	@Override
	public void research() {
		logger.debug("고고학자:교토에서 과거 일본에 불시착한 한국의 도래인들이 만들어낸 문화유적을 살펴볼 수 있었다.");

	}

	@Override
	public void inspire() {
		logger.debug("예술가:일본의 벚꽃은 세상을 취하게 만드는 공기 중 알코올을 내뿜고 있었다.");

	}

	@Override
	public String whether() {
		String whether = "따뜻함";
		return whether;

	}

}
