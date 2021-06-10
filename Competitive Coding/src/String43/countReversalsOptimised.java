package String43;

public class countReversalsOptimised {

	public static int countReversals(String s) {
		if(s.length()%2!=0) {
			return -1;
		}
		int leftb=0;
		int rightb=0;
		int i=0;
		while(i<s.length()) {
			char ch=s.charAt(i);
			if(ch=='{') {
				leftb++;
			}
			else {
				if(leftb!=0) {
					leftb--;
				}
				else {
					rightb++;
				}
			}
			i++;
		}
		
		return (int)(Math.ceil((0.0+leftb)/2)+Math.ceil((0.0+rightb)/2));
	}
	
	public static void main(String[] args) {
		String s="}}}}}}{}{}}}{{}}}}{}}{{{}{}{}{}}{{{{}}}{}}";
		int ans=countReversals(s);
		System.out.println(ans);
	}

}
