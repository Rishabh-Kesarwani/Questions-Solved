package String43;
import java.util.Scanner;

public class EditDistanceDP {
	
	public static int editDistanceDP(String s1, String s2, int m, int n) {
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0) {
					dp[i][j]=j;
				}
				else if(j==0) {
					dp[i][j]=i;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					dp[i][j]= 1+ Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
				}
			}
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s1=scn.nextLine();
		String s2=scn.nextLine();
		int ans=editDistanceDP(s1,s2,s1.length(),s2.length());
		System.out.println(ans);
	}
}
