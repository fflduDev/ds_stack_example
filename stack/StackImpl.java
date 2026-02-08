package stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl implements Stack {
	
	List<String> elements = new ArrayList<>();

	public void push(String s) {
		elements.add(s);
	}

	public String pop() {
		return null;
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {

		for(String s : elements)
			System.out.println("Current thing on stack: " + s);
		
		
	}

}
