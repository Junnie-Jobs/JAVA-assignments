package stack;

import java.util.ArrayList;

public class CoordinatesStack {
	
	private int top;
	private ArrayList<Coordinates> coordinatesStack = new ArrayList<Coordinates>();
	
	public CoordinatesStack(){
		
		top = 0;
		coordinatesStack.add(new Coordinates(0,1));
	}
	
	public int getTop(){
		return top;
	}
	
	public ArrayList<Coordinates> getCoordinatesStack(){
		return coordinatesStack;
	}
	
	public boolean isEmpty(){
		if(top == 0)
			return true;
					
		return false;
	}
	
	public void push(int x, int y){
		Coordinates coordinates = new Coordinates(x,y);
		top++;
		coordinatesStack.add(top, coordinates);
	}
	
	public void pop(){
		if(isEmpty()){
			System.out.println("Coordinatesstack is empty");
			return;
		}
		top--;
	}
	
	public Coordinates peek(){
		return coordinatesStack.get(top);
	}

}
