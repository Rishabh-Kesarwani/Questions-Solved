package SearchingAndSorting;

public class QuickSort {

	public static void QuickSort(int arr[], int lo, int hi) {
		if(lo>=hi) {
			return;
		}
		int pivot=arr[hi];
		int pi=Partition(arr,pivot,lo,hi);
		QuickSort(arr,lo,pi-1);
		QuickSort(arr,pi+1,hi);
	}
	
	public static int Partition(int arr[],int pivot, int lo, int hi) {
		int i=lo;
		int j=lo;
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
		return j-1;   // <= where we increased i&j so pivot element index j-1
	}
	
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int arr[]= {8,5,1,3,7,2,9,6};
		QuickSort(arr,0,arr.length-1);
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
}
