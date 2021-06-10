
public class palindromicArray {

	public static int CheckPalindrome(int arr[]) {
		for(int i=0;i<arr.length;i++){
            if(!checkPalindrome(arr[i])){
                return 0;
            }
        }       
        return 1;
	}
	
	public static boolean checkPalindrome(int n){
	    int temp=n;
		int reverse=0;
	    while(n!=0){
	        int remainder=n%10;
	        reverse=reverse*10+remainder;
	        n=n/10;
	    }
	    if(reverse==temp){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
	
	public static void main(String[] args) {
		int arr[]= {111,222,333,555,444};
		int ans=CheckPalindrome(arr);
		System.out.println(ans);
	}

}
