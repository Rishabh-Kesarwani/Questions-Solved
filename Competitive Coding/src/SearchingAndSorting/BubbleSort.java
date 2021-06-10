package SearchingAndSorting;

public class BubbleSort {

	public static void BubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
			System.out.println("Finished "+(i+1)+" "+"Iteration");
			for(int elem:arr) {
				System.out.print(elem+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void swap(int arr[], int i , int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int arr[]= {5,9,8,2,1};
		BubbleSort(arr);
	}
}
