package String43;
public class KMPAlgorithm {

	public static void KMPAlgo(String txt, String pat) {
		int m=txt.length();
		int n=pat.length();
		int lps[]=new int[n];
		calculatelps(pat,n,lps);
		int j=0;			//for the lps array
		int i=0;			//for the String
		while(i<m) {
			if(pat.charAt(j)==txt.charAt(i)){
				j++;
				i++;
			}
			if(j==n) {
				System.out.println("Pattern Found At "+ (i-j));
				j=lps[j-1];
			}
			else if(i<m && txt.charAt(i)!=pat.charAt(j)) {
				if(j!=0) {
					j=lps[j-1];
				}
				else {
					i=i+1;
				}
			}
		}
	}
	
	public static void calculatelps(String pat, int n , int lps[]) {
		int len=0;
		int i=1;
		lps[0]=0;
		while(i<n) {
			if(pat.charAt(i)==pat.charAt(len)) {
				len++;
				lps[i]=len;
				i++;
			}
			else {
				if(len!=0) {
					len=lps[len-1];
				}
				else {
					lps[i]=0;
					i++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String txt="ABABDABACDABABCABAB";
		String pat="ABABCABAB";
		KMPAlgo(txt,pat);
	}
}
