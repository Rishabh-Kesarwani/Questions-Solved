package String43;

public class LongestCommonPrefix {

	public static int findMinLength(String arr[]) {
		int min=arr[0].length();
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i].length()<min) {
				min=arr[i].length();
			}
		}
		
		return min;
	}
	
	public static String commonPrefix(String arr[], int n) {
		int min=findMinLength(arr);
		String result="";
		char current;
		
		for(int i=0;i<min;i++) {
			current=arr[0].charAt(i);
			for(int j=1;j<n;j++) {
				if(arr[j].charAt(i)!=current) {
					return result;
				}
			}
			result+=current;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String arr[]= {"geeksforgeeks", "geeks",
	            "geek", "geezer"};
		String ans=commonPrefix(arr,arr.length);
		System.out.println(ans);
	}

}
