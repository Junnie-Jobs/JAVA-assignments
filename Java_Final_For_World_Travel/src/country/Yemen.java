package country;

import org.apache.log4j.Logger;

public class Yemen extends CountryBaisc {
	private static Logger logger = Logger.getLogger(Yemen.class);

	String name = "예맨";

	private static Yemen yemen = new Yemen();

	private Yemen() {
	}

	public static Yemen getInstance() {

		if (yemen == null) {
			yemen = new Yemen();
		}
		return yemen;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가: 소코트라섬에서의 패러글라이딩으로 하늘에서 바라본 예맨의 속살은 아직 대지와 탯줄이 끊어지지 않은 모습이었다.");

	}

	@Override
	public void research() {
		logger.debug("고고학자: 고대수도 사나에서 눈에 가장 띄는건 나였다. 왜냐하면 그곳의 사람들은 2000년전의 삶을 간직하고 있었기 때문이다.");

	}

	@Override
	public void inspire() {
		logger.debug("예술가: 고대도시의 마천루 위에서 바라보는 풍경은 나 혼자 외계인이 된 기분이었다.");

	}

	@Override
	public String whether() {

		String whether = "따뜻함";
		return whether;

	}

}
