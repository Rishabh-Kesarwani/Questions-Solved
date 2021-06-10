import java.util.Scanner;

public class SeparateOddEven {

	public static void SeparateOddEven(int arr[]) {
		// i to e is untouched
		// j to i-1 is even
		//0 to j-1 is odd
		
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]%2==0) {
				i++;
			}
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
	}
	
	private static void swap(int arr[],int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void print(int arr[]) {
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		print(arr);
		System.out.println();
		SeparateOddEven(arr);
		print(arr);

	}

}
