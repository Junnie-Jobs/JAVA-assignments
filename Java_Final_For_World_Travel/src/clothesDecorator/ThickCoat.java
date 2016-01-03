package clothesDecorator;

import org.apache.log4j.Logger;

public class ThickCoat extends Decorator{
	
	private static Logger logger = Logger.getLogger(ThickCoat.class);

	public ThickCoat(Clothes clothes) {
		super(clothes);
	}

	@Override
	public void wearing() {
		super.wearing();
		logger.debug("두꺼운 코트");
	}
	
	

}
