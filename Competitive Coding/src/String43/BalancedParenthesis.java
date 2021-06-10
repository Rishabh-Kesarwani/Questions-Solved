package String43;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static boolean checkParenthesis(String x) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)=='['||x.charAt(i)=='{'||x.charAt(i)=='(') {
				stack.push(x.charAt(i));
			}
			else if(stack.isEmpty()) {
				return false;
			}
			else {
				if(x.charAt(i)==']') {
					if(stack.peek()!='[') {
						return false;
					}
				}
				else if(x.charAt(i)=='}') {
					if(stack.peek()!='{') {
						return false;
					}
				}
				else {
					if(stack.peek()!='(') {
						return false;
					}
				}
				stack.pop();
			}
		}
		if(stack.size()!=0) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		boolean ans=checkParenthesis(s);
		System.out.println(ans);
	}
}
