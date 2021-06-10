import java.util.Scanner;

public class RotationOfArray {

	public static void RotateArray(int arr[], int k) {
		int n=arr.length;
		if(k>n||k<0) {
			k=k%n;
		}
		if(k<0) {
			k=k+n;
		}
		int p1=n-k-1;
		reverse(arr,0,p1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
	}
	
	public static void reverse(int arr[], int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]= new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		
		RotateArray(arr,k);
		
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
}
