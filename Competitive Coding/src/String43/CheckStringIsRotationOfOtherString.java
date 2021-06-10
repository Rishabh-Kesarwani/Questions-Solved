package String43;

public class CheckStringIsRotationOfOtherString {

	public static boolean CheckRotation(String str1, String str2) {
		str1=str1.concat(str1);
		int i=0;
		int j=str2.length();
		while(j<str1.length()) {
			if(str2.equals(str1.substring(i, j))){
				return true;
			}
			i++;
			j++;
		}
		return false;
	}
	
	public static boolean CheckRotation2(String str1, String str2) {
		
		if((str1.length()==str2.length())&&(str1+str1).indexOf(str2)!=-1) {
			System.out.println((str1+str1).indexOf(str2));
			return true;
		}
		System.out.println((str1+str1).indexOf(str2));
		return false;
	}
	
	
	public static void main(String[] args) {
		String str1="ABCDE";
		String str2="CDEAB";
		boolean ans=CheckRotation2(str1,str2);
		System.out.println(ans);
	}
}
