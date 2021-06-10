package String43;
public class convertSentenceIntoMobileKeypad {

	public static void PrintKeypad(String s[], String txt) {
		String output="";
		int i=0;
		while(i<txt.length()) {
			if(txt.charAt(i)==' ') {
				output=output+0;
			}
			else {
				int position=txt.charAt(i)-'A';
				output=output+s[position];
			}
			i++;
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		String s[]= {"2","222","222","3","33","333","4","44","444","5","55","555",
				"6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
		
		String txt="RISHABH KESARWANI";
		PrintKeypad(s , txt);
	}
}
