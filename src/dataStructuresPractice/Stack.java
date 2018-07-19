package dataStructuresPractice;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Object> stack;
	
	public Stack() {
		stack = new ArrayList<Object>();
	}
	
	public boolean push(Object toPush) {
		try {
			stack.add(0, toPush);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public Object pop() {
		return stack.remove(0);
	}
	
	public Object peek() {
		if(stack.size() == 0) {
			return null;
		}
		return stack.get(0);
	}
}
