package String43;
import java.util.Stack;

public class countReversals {

	public static int countReversals(String s) {
		if(s.length()%2!=0) {
			return -1;
		}
		Stack<Character> stack=new Stack<>();
		double open=0;
		double close=0;
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i)=='{') {
				stack.push(s.charAt(i));
				open++;
			}
			else if(stack.size()!=0 && s.charAt(i)=='}' && stack.peek()=='{') {
				stack.pop();
				open--;
			}
			else if(s.charAt(i)=='}') {
				stack.push(s.charAt(i));
				close++;
			}
			i++;
		}
		return (int)(Math.ceil(open/2)+Math.ceil(close/2));		
	}
	
	public static void main(String[] args) {
		String s="}}}}}}{}{}}}{{}}}}{}}{{{}{}{}{}}{{{{}}}{}}"; // return 7
		int ans=countReversals(s);
		System.out.println(ans);
	}
}
