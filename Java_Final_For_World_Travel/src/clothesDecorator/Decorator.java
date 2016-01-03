package clothesDecorator;

public class Decorator extends Clothes{
	
	Clothes clothes;
	
	public Decorator(Clothes clothes){
		this.clothes = clothes;
	}

	@Override
	public void wearing() {
		clothes.wearing();
		
	}

}
