package dataStructuresPractice;

public class ReverseString {
	private static ReverseString reverseString;

	private ReverseString() {
		
	}
	
	public static ReverseString getInstance() {
		if(reverseString == null)
			reverseString = new ReverseString();
		
		return reverseString;
	}
	
	public String reverseString(String toReverse) {
		Stack charStack = new Stack();
		char[] stringChars = toReverse.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char ch: stringChars) {
			charStack.push(ch);
		}
		
		while(charStack.peek() != null) {
			sb.append((char) charStack.pop());
		}
		
		return sb.toString();
	}
}
