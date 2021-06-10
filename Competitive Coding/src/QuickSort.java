import java.util.Scanner;

public class QuickSort {

	public static void quickSort(int arr[],int lo,int hi) {
		if(lo>=hi) {
			return;
		}
		int pivot=arr[hi];
		int pi=Partition(arr,pivot,lo,hi);
		quickSort(arr, lo, pi-1);
		quickSort(arr,pi+1,hi);
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
		quickSort(arr,0,n-1);
		print(arr);
	}
}
