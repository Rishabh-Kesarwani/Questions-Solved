package String43;

public class PatternSearchingBoyerMoore {
	static int no_of_char=256;
	
	static int max(int a, int b) {
		return (a>b)?a:b;
		}
	
	static void badCharHeuristic(char []str, int m, int badchar[]) {
		for(int i=0;i<no_of_char;i++)
			badchar[i]=-1;
		for(int i=0;i<m;i++) {
			badchar[(int)str[i]]=i;
		}
	}
	
	static void Search(char text[], char pat[] ) {
		int n=text.length;
		int m=pat.length;
		
		int badchar[]=new int[no_of_char];
		badCharHeuristic(pat, m, badchar);
		
		int s=0;
		while(s<=(n-m)) {
			int j=m-1;
			while(j>=0&& pat[j]==text[s+j]) {
				j--;
			}
			if(j<0) {
				System.out.println("Pattern occurs at shift= "+ s);
				s+=(s+m<n)?m-badchar[text[s+m]]:1;
			}
			else {
				s+=max(1,j-badchar[text[s+j]]);
			}
		}
	}
	
	public static void main(String[] args) {
		char text[]="AABAACAADAABAABA".toCharArray();
		char pat[]="AABA".toCharArray();
		Search(text,pat);
	}

}
