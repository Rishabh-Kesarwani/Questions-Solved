import java.util.Scanner;

public class minimumNoOfJumpsO1 {

	public static int MinJumps(int arr[]) {
		if(arr.length<=1) {
			return 0;
		}
		if(arr[0]==0) {
			return -1;
		}
		
		int maxreach=arr[0];
		int step=arr[0];
		int jump=1;
		
		for(int i=1;i<arr.length;i++) {
			if(i==arr.length-1) {
				return jump;
			}
			
		maxreach=Math.max(maxreach, i+arr[i]);
		step--;
		if(step==0) {
			jump++;
			
			if(i>=maxreach) {
				return -1;
			}
			
			step=maxreach-i;
		}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int ans=MinJumps(arr);
		System.out.println(ans);
	}

}
//1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 