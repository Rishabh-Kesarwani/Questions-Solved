package String43;
import java.util.Scanner;

public class countSubstringsWithEqualZeroOne {

	public static int countSubstrings(String s,int n) {
		int count=0,count0=0,count1=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='0') {
				count0++;
			}
			else if(s.charAt(i)=='1') {
				count1++;
			}
			if(count0==count1&&count0!=0) {
				count++;
				count0=0;
				count1=0;
			}
		}
		if(count0!=count1) {
			return -1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		int ans=countSubstrings(s,s.length());
		System.out.println(ans);
	}
}
