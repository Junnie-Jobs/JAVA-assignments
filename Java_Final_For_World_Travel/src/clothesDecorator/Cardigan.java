package clothesDecorator;

import org.apache.log4j.Logger;

import country.America;

public class Cardigan extends Decorator{
	
	private static Logger logger = Logger.getLogger(America.class);

	
	public Cardigan(Clothes clothes){
		super(clothes);
	}

	@Override
	public void wearing() {
		super.wearing();
		logger.debug("가디건");
		
	}

}
