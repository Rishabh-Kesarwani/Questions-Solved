package SearchingAndSorting;

public class SelectionSort {

//	public static void SelectionSort(int arr[]) {
//		for(int i=0;i<arr.length-1;i++) {
//			int min=arr[i];
//			int minIndex=i;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j]<min) {
//					minIndex=j;
//					min=arr[j];
//				}
//			}
//			swap(arr,i,minIndex);
//			System.out.println("Iteration "+(i+1)+" "+"Of Selection Sort");
//			for(int elem:arr) {
//				System.out.print(elem+" ");
//			}
//			System.out.println();
//		}
//	}
	
	public static void SelectionSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			int minIndex=i;
			int min=arr[i];
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
				minIndex=j;
				min=arr[j];
				}
			}
			swap(arr,i,minIndex);

			// To print the array at each iteration
			System.out.println("Iteration"+ (i+1));
			for(int elem:arr){
			System.out.print(elem+" ");
			}
			System.out.println();
		}
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int arr[]= {5,9,8,1,2};
		System.out.println("Selection Sort");
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
		System.out.println();
		SelectionSort(arr);
	}
}
