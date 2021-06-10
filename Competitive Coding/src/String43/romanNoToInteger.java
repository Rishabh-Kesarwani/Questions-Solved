package String43;

public class romanNoToInteger {

	static int value(char ch) {
		if(ch=='I')
			return 1;
		if(ch=='V')
			return 5;
		if(ch=='X')
			return 10;
		if(ch=='L')
			return 50;
		if(ch=='C')
			return 100;
		if(ch=='D')
			return 500;
		if(ch=='M')
			return 1000;
		return -1;
	}
	
	static int romanToDecimal(String roman) {
		int res=0;
		for(int i=0;i<roman.length();i++) {
			int s1=value(roman.charAt(i));
			if(i+1<roman.length()) {
				int s2=value(roman.charAt(i+1));
							//if first char is greater than 2nd char VI
				if(s1>=s2) {
					res+=s1;
				}			//if 2nd char is greater than first char like IV=4, IX=9
				else {
					res+=s2-s1;
					i++;
				}
			}
			else {
				res=res+s1;
			}	
		}
		return res;
	}
	
	public static void main(String[] args) {
		String roman="MCMIV";
		System.out.println(romanToDecimal(roman));
	}
}
