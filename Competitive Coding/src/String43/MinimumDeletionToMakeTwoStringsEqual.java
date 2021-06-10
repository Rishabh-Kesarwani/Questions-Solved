package String43;
import java.util.Scanner;

public class MinimumDeletionToMakeTwoStringsEqual {

	public static int findMinCost(String s1,String s2, int c1, int c2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		for(int i=dp.length-2;i>=0;i--) {
			for(int j=dp[0].length-2;j>=0;j--) {
				if(s1.charAt(i)==s2.charAt(j)) {
					dp[i][j]=1+dp[i+1][j+1];
				}
				else {
					dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		int lcs=dp[0][0];
		int s1r=s1.length()-lcs;
		int s2r=s2.length()-lcs;
		int cost=c1*s1r+c2*s2r;
		return cost;
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s1=scn.nextLine();
		String s2=scn.nextLine();
		int c1=1,c2=1;
		int ans=findMinCost(s1,s2,c1,c2);
		System.out.println(ans);
	}
}
