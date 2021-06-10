package String43;

import java.util.Scanner;

public class LongestRecuringSubsequence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		int dp[][]=new int[s.length()+1][s.length()+1];
		
		for(int i=dp.length-2;i>=0;i--) {
			for(int j=dp[0].length-2;j>=0;j--) {
				if(s.charAt(i)==s.charAt(j)&& i!=j) {
					dp[i][j]=1+dp[i+1][j+1];
				}
				else {
					dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		System.out.println(dp[0][0]);
	}

}

/*for(int i=dp.length-1;i>=0;i--) {
	for(int j=dp[0].length-1;j>=0;j--) {
		if(i=dp.length-1 && j=dp[0].length=1) {
			dp[i][j]=0;
		}
		else if(i=dp.length-1) {
			dp[i][j]=0;
		}
		else if(j=dp[0].length -1) {
			dp[i][j]=0;
		}
		else {
			if(s.charAt(i)==s.charAt(j)&& i!=j) {
				dp[i][j]=1+dp[i+1][j+1];
			}
			else {
				dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);
			}
		}
	}
}*/