package String43;
import java.util.Vector;

public class MinimumSwapsForBracketBalancing {

	public static int MinimumSwaps(String s) {
		Vector<Integer> pos=new Vector<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='[') {
				pos.add(i);
			}
		}
		int sum=0;
		int count=0;
		int p=0;
		char S[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			if(S[i]=='[') {
				count++;
				p++;
			}
			else {
				count--;
			}
			
			if(count<0) {
				int j=pos.get(p);
				sum+=j-i;
				swap(S,i,j);
				p++;
				count=1;
			}
		}
		return sum;
	}
	
	public static int MinimumSwapsOpti(String s) {
		char S[]=s.toCharArray();
		int leftB=0,rightB=0, imbalance=0, swap=0;
		for(int i=0;i<s.length();i++) {
			if(S[i]=='[') {
				leftB++;
				if(imbalance>0) {
					swap+=imbalance;
					imbalance--;
				}
			}
			else{
				rightB++;
				imbalance=rightB- leftB;
			}
		}
		return swap;
	}
	
	public static void swap(char s[],int i, int j) {
		char temp=s[i];
		s[i]=s[j];
		s[j]=temp;
	}
	
	public static void main(String[] args) {
		String str="[]]]][[]][][]][[[[[]";
		int ans=MinimumSwapsOpti(str);
		System.out.println(ans);
	}
}
