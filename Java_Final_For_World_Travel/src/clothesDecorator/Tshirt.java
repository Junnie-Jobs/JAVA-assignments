package clothesDecorator;

import org.apache.log4j.Logger;

public class Tshirt extends Clothes {
	
	private static Logger logger = Logger.getLogger(Tshirt.class);
		
	@Override
	public void wearing() {
		logger.debug("티셔츠");
	}

}
