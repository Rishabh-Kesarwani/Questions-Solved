package String43;
import java.util.Scanner;

public class EditDistanceRecursion {
	
	public static int editDistance(String s1, String s2, int m, int n) {
		if(m==0) {
			return n;
		}
		if(n==0) {
			return m;
		}
		if(s1.charAt(m-1)==s2.charAt(n-1)) {
			return editDistance(s1, s2, m-1, n-1);
		}
		return 1+Math.min(editDistance(s1, s2, m, n-1),  //insert
				Math.min(editDistance(s1, s2, m-1, n),   // remove
						editDistance(s1, s2, m-1, n-1)));// replace
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s1=scn.nextLine();
		String s2=scn.nextLine();
		int ans=editDistance(s1,s2,s1.length(),s2.length());
		System.out.println(ans);
	}
}
