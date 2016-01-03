package country;

import org.apache.log4j.Logger;

public class Greece extends CountryBaisc {
	
	private static Logger logger = Logger.getLogger(Greece.class);

	String name = "그리스";

	private static Greece greece = new Greece();

	private Greece() {
	}

	public static Greece getInstance() {

		if (greece == null) {
			greece = new Greece();
		}
		return greece;
	}

	public String toString() {
		return name;
	}

	@Override
	public void adventure() {
		logger.debug("모험가: 크레타섬에서 미궁에 빠진 미노타우로스의 궁전을 빠져나왔다.");

	}

	@Override
	public void research() {
		logger.debug("고고학자: 그리스의 유적이 훌륭한 것은 지중해의 강렬한 햇빛이 그 명암을 분명히 만들었기에 더욱 외향적일 수 있었던 것 같다.");

	}

	@Override
	public void inspire() {
		logger.debug("예술가: 그리스의 예술은 완벽한 비례와 대칭. 신의 영역에 도달하고자 하였던 그들의 정신성은 여전히 완벽한 균형 위에서 살아있었다.");

	}

	@Override
	public String whether() {

		String whether = "선선함";
		return whether;

	}

}
