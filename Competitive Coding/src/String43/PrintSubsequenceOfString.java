package String43;
import java.util.Scanner;

public class PrintSubsequenceOfString {

	public static void PrintSS(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		PrintSS(roq,ans+"");
		PrintSS(roq,ans+ch);
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		PrintSS(s,"");
	}
}
