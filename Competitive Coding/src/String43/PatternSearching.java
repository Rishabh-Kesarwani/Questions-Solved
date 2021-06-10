package String43;

public class PatternSearching {

	public static void Search(String txt, String pat) {
		int m=txt.length();
		int n=pat.length();
		for(int i=0;i<=m-n;i++) {
			int j;
			for(j=0;j<n;j++) {
				if(txt.charAt(i+j)!=pat.charAt(j)) {
					break;
				}
			}
			if(j==n) {
				System.out.println("Pattern is present at"+" "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		String text="AABAACAADAABAABA";
		String pat="AABA";
		Search(text,pat);
	}
}
