package country;

import org.apache.log4j.Logger;

public class Austrailia extends CountryBaisc {
	
	private static Logger logger = Logger.getLogger(Austrailia.class);

	String name = "호주";

	private static Austrailia austrailia = new Austrailia();

	private Austrailia() {
	}

	public static Austrailia getInstance() {

		if (austrailia == null) {
			austrailia = new Austrailia();
		}
		return austrailia;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가: 천혜의 자연을 가진 호주에서 원주민들처럼 사냥하는 경험을 했다.");

	}

	@Override
	public void research() {
		logger.debug("호주의 브램북 국립공원에서는 원주민들의 유적물을 살펴볼 수 있었다. 문명은 우리가 앞설지라도 그들의 문화에서는 고개를 숙일 수 밖에 없었다.");
	}

	@Override
	public void inspire() {
		logger.debug("호주의 예술은 인간이 아닌 자연의 이야기를 듣는 것이었다.");

	}

	@Override
	public String whether() {

		String whether = "따뜻함";
		return whether;

	}

}
