package clothesDecorator;

import org.apache.log4j.Logger;

public class ThinCoat extends Decorator{
	
	private static Logger logger = Logger.getLogger(ThinCoat.class);
	
	public ThinCoat(Clothes clothes) {
		super(clothes);
	}

	@Override
	public void wearing() {
		super.wearing();
		logger.debug("얇은 코트");
	}
	


}
