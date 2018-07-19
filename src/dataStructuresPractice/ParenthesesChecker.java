package dataStructuresPractice;


public class ParenthesesChecker {
	private static ParenthesesChecker paranthesisChecker = null;
	private static Stack stack;
	
	private ParenthesesChecker() {
		
	}
	
	public static ParenthesesChecker getInstance() {
		if(paranthesisChecker == null) {
			paranthesisChecker = new ParenthesesChecker();
			stack = new Stack();
		}
		
		return paranthesisChecker;
	}
	
	public String checkBalanced(String toCheck) {
		char[] splitParam = toCheck.toCharArray();
		
		if(splitParam.length%2 != 0)
			return "unbalanced";
		
		for(char paren : splitParam) {
			if(stack.peek() == null) {
				stack.push(paren);
			}
			else if((char)stack.peek() == '[') {
				if(paren == ']') {
					stack.pop();
				}
				else if(paren == '(' || paren == '{' || paren == '[') {
					stack.push(paren);
				}
				else
					return "unbalanced";
			}
			else if ((char)stack.peek() == '(') {
				if(paren == ')') {
					stack.pop();
				}
				else if(paren == '(' || paren == '{' || paren == '[') {
					stack.push(paren);
				}
				else
					return "unbalanced";
			}
			else if ((char)stack.peek() == '{') {
				if(paren == '}') {
					stack.pop();
				}
				else if(paren == '(' || paren == '{' || paren == '[') {
					stack.push(paren);
				}
				else
					return "unbalanced";
			}
		}
			
		
		return "balanced";
	}
}
