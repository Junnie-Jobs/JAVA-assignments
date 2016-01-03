package country;

import org.apache.log4j.Logger;

public class India extends CountryBaisc {
	
	private static Logger logger = Logger.getLogger(India.class);

	String name = "인도";

	private static India india = new India();

	private India() {
	}

	public static India getInstance() {

		if (india == null) {
			india = new India();
		}
		return india;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가: 분쟁지역으로 치안이 위험했지만, 스리나가르의 호수에서 펼쳐진 모험은 그 무엇보다 그곳의 순수한 사람들을 조우하게 해주었다.");

	}

	@Override
	public void research() {
		logger.debug("고고학자: 바라나시에서 인도인들의 세계관과 삶과 죽음을 대하는 모습을 살펴보는데, 비록 그 강은 화학적으로는 더럽지만, 그들의 정신은 너무나 맑고 선명했다.");

	}

	@Override
	public void inspire() {
		logger.debug("예술가: 타지마할의 순백의 아름다움은 보름달이 뜨는 순간, 눈을 뜨고야 말았다.");

	}

	@Override
	public String whether() {

		String whether = "무더위";
		return whether;

	}

}
