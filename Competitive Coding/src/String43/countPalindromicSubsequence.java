package String43;

public class countPalindromicSubsequence {

	public static int countPalindromicSubsequence(String s) {
		int dp[][]=new int[s.length()][s.length()];
		for(int g=0;g<s.length();g++) {
			for(int i=0,j=g;j<s.length();j++,i++) {
				if(g==0) {
					dp[i][j]=1;
				}
				else if(g==1) {
					if(s.charAt(i)==s.charAt(j)) {
						dp[i][j]=3;
					}
					else {
						dp[i][j]=2;
					}
				}
				else {
					if(s.charAt(i)==s.charAt(j)) {
						dp[i][j]=dp[i][j-1]+dp[i+1][j]+1;
					}
					else {
						dp[i][j]=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
					}
				}
			}
		}
		return dp[0][s.length()-1];
	}
	
	public static void main(String[] args) {
		String s="abccbc";
		int ans=countPalindromicSubsequence(s);
		System.out.println(ans);
	}
}
