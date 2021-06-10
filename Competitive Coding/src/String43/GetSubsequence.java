package String43;
import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

	public static ArrayList<String> findSubsequence(String s){
		if(s.length()==0) {
			ArrayList<String> bs=new ArrayList<>();
			bs.add("");
			return bs;	
		}
		char ch=s.charAt(0);
		ArrayList<String> ros=findSubsequence(s.substring(1));
		ArrayList<String> ress=new ArrayList<>();
		for(String elem:ros) {
			ress.add(""+elem);
		}
		for(String elem:ros) {
			ress.add(ch+elem);
		}
		return ress;
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		ArrayList<String> ans=findSubsequence(s);
		System.out.println(ans);
	}
}
