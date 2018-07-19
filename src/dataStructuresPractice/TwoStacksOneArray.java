package dataStructuresPractice;

public class TwoStacksOneArray {
	private int[] stack;
	private int stack1Ind;
	private int stack2Ind;
	
	public TwoStacksOneArray(int stackSize) {
		stack = new int[stackSize*2];
		stack1Ind = 0;
		stack2Ind = stackSize*2-1;
	}
	
	public void readCommands(int numCommands, String command) {
		String[] commandArr = command.split(" ");
		StringBuilder popStr = new StringBuilder();
		int commandNum = 1;
		int curCommandInd = 0;
		
		while(commandNum <= numCommands) {
			System.out.println(commandNum);
			if(Integer.parseInt(commandArr[curCommandInd]) == 1) {
				if(Integer.parseInt(commandArr[curCommandInd+1]) == 1) {
					//push charAt i+2 to stack 1
					System.out.println("stack 1 push: " + Integer.parseInt(commandArr[curCommandInd+2]));
					stack1Push(Integer.parseInt(commandArr[curCommandInd+2]));
					curCommandInd += 3;
				}
				else {
					//pop
					System.out.println("stack 1 peek: " + stack1Peek());
					popStr.append(stack1Pop());
					popStr.append(" ");
					curCommandInd+=2;
				}
			}
			else if(Integer.parseInt(commandArr[curCommandInd]) == 2) {
				if(Integer.parseInt(commandArr[curCommandInd+1]) == 1) {
					//push charAt i+2 to stack 1
					System.out.println("stack 2 push: " + Integer.parseInt(commandArr[curCommandInd+2]));
					stack2Push(Integer.parseInt(commandArr[curCommandInd+2]));
					curCommandInd += 3;
				}
				else {
					//pop
					System.out.println("stack 2 peek: " + stack2Peek());
					popStr.append(stack2Pop());
					popStr.append(" ");
					curCommandInd+=2;
				}
			}
			commandNum ++;
		}
		
		
		System.out.println(popStr.toString());
	}
	
	public boolean stack1Push(int val) {
		if(stack1Ind == stack2Ind) {
			return false;
		}
		stack[stack1Ind] = val;
		stack1Ind++;
		
		return true;
	}
	
	public boolean stack2Push(int val) {
		if(stack1Ind == stack2Ind) {
			return false;
		}
		stack[stack2Ind] = val;
		stack2Ind--;
		
		
		return true;
	}
	
	public int stack1Pop() {
		int popVal = -1;
		if(stack1Ind >= 0) {
			stack1Ind--;
			popVal = stack[stack1Ind];
		}
		return popVal;
	}
	
	public int stack2Pop() {
		int popVal = -1;
		if(stack2Ind < stack.length-1) {
			stack2Ind++;
			popVal = stack[stack2Ind];
		}
		return popVal;
	}
	
	public int stack1Peek() {
		if(stack1Ind-1 >= 0)
			return stack[stack1Ind-1];
		
		return -1;
	}
	
	public int stack2Peek() {
		if(stack2Ind+1 <= stack.length-1)
			return stack[stack2Ind+1];
		
		return -1;
	}
}
