package SearchingAndSorting;

public class PartitionOfArray {

	public static void partition(int arr[],int p) {
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]>p) {
				i++;
			}
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int arr[]= {7,9,4,8,3,6,2,1};
		partition(arr,5);
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
}
