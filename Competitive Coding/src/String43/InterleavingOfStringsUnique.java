package String43;

public class InterleavingOfStringsUnique {

	public static boolean checkInterleaved(String str1,String str2,String str3) {
		if(str3.length()!=str1.length()+str2.length()) {
			return false;
		}
		int i=0,j=0,k=0;
		
		while(k!=str3.length()) {
			if(i<str1.length()&&str1.charAt(i)==str3.charAt(k)) {
				i++;
			}
			else if(j<str2.length()&& str2.charAt(j)==str3.charAt(k)) {
				j++;
			}
			else {
				return false;
			}
			k++;
		}
		
		if(i<str1.length()||j<str2.length()) {
			return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		String str1="abcd";
		String str2="efgh";
		String str3="aebfcdgh";
		boolean ans=checkInterleaved(str1,str2,str3);
		System.out.println(ans);
	}

}
