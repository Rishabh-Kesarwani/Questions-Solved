package String43;

public class PatternSearchingKMPalgo {

	public static void Search(String txt, String pat, int q) {
		int d=256;
		int m=pat.length();
		int n=txt.length();
		int t=0;
		int p=0;
		int i,j;
		int h=1;
		
		for(i=0;i<m-1;i++) {
			h=(h*d)%q;
		}
		
		for(i=0;i<m;i++) {
			t=(t*d+txt.charAt(i))%q;
			p=(p*d+pat.charAt(i))%q;
		}
		
		for(i=0;i<=n-m;i++) {
			if(p==t) {
				for(j=0;j<m;j++) {
					if(txt.charAt(i+j)!=pat.charAt(j)) {
						break;
					}
				}
				if(j==m) {
					System.out.println("Pattern is Present at"+" "+i);
				}
			}
			
			if(i<n-m) {
				t=(d*(t-txt.charAt(i)*h)+txt.charAt(m+i))%q;

				if(t<0) {
					t=t+q;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String txt="AABAAAABAACABAABA";
		String pat="AABA";
		Search(txt,pat,101);
	}
}
