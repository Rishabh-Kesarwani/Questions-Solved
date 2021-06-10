import java.util.Scanner;

public class QuickSelect {

	public static int QuickSelect(int arr[], int lo, int hi , int k) {
		int pivot=arr[hi];
		int pi=Partition(arr, pivot, lo, hi);
		if(k<pi) {
			return QuickSelect(arr, lo, pi-1, k);
		}
		else if(k>pi) {
			return QuickSelect(arr, pi+1, hi, k);
		}
		else {
			return arr[pi];
		}
	}
	
	public static int Partition(int arr[], int pivot, int lo, int hi) {
		int i=lo,j=lo;
		while(i<=hi) {
			if(arr[i]>pivot) {
				i++;
			}
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		return (j-1);
	}
	
	public static void swap(int arr[], int i, int j) {
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
		int k=s.nextInt();
		int ans=QuickSelect(arr,0,n-1,k-1);
		System.out.println(ans);

	}

}
