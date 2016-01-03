package country;

import org.apache.log4j.Logger;

public class Peru extends CountryBaisc {
	
	private static Logger logger = Logger.getLogger(Peru.class);

	String name = "페루";

	private static Peru peru = new Peru();

	private Peru() {
	}

	public static Peru getInstance() {

		if (peru == null) {
			peru = new Peru();
		}
		return peru;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가: 페루의 나스카 문양을 보기 위해 경비행기에 몸을 실었다. 공중에서만 볼 수 있는 그림. 이 그림은 과연 무엇을 위한 것일");

	}

	@Override
	public void research() {
		logger.debug("고고학자: 공중도시 페루의 마추픽추에는 여전히 물이 흐르고 있었다. 어쩌면 그들은 사라지지 않을 것일지도 모른다.");

	}

	@Override
	public void inspire() {
		logger.debug("예술가: 잉카인드르이 예술작품은 그 자체로 혼이 깃들어 있다. 그 표정들을 어찌 잊으리...");

	}

	@Override
	public String whether() {

		String whether = "선선함";
		return whether;

	}

}
