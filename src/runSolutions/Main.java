package runSolutions;

import dataStructuresPractice.ParenthesesChecker;
import dataStructuresPractice.ReverseString;
import dataStructuresPractice.TwoStacksOneArray;

public class Main {
	public static void main (String args[]) {
		//done
//      dataStructuresPractice();
		//done
//      reverseStringViaStack();
		
		//done
		//TwoStacksOneArray
//		TwoStacksOneArray twoStack = new TwoStacksOneArray(3);
//		System.out.println("1 1 2 1 1 3 2 1 4 1 2 2 2 2 2");
//		twoStack.readCommands(6, "1 1 2 1 1 3 2 1 4 1 2 2 2 2 2");
		
    }
	
	public static void reverseStringViaStack() {
		ReverseString reverseString = ReverseString.getInstance();
		
		System.out.println(reverseString.reverseString("GeeksQuiz"));
		System.out.println(reverseString.reverseString("GeeksforGeeks"));
	}
	public static void dataStructuresPractice() {
		ParenthesesChecker parenChecker = ParenthesesChecker.getInstance();
		
		System.out.println(parenChecker.checkBalanced("[()]{}{[()()]()}"));
		System.out.println(parenChecker.checkBalanced("[(])"));
	}
}
