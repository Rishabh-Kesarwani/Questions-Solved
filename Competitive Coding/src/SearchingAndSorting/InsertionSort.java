package SearchingAndSorting;

public class InsertionSort {
	
//	public static void InsertionSort(int arr[]) {
//		for(int i=1;i<arr.length;i++) {
//			for(int j=i-1;j>=0;j--) {
//				if(arr[j]>arr[j+1]) {
//					swap(arr,j,j+1);
//				}
//				else {
//					break;
//				}
//			}
//
//			// to print at each iteration
//
//			System.out.println("Iteration "+(i)+" "+"Of Insertion Sort");
//			for(int elem:arr) {
//				System.out.print(elem+" ");
//			}
//			System.out.println();
//		}
//	}
	
	public static void InsertionSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j>=1;j--){
				if(arr[j-1]>arr[j]){
					swap(arr,j-1,j);
				}
				else{
					break;
				}
			}
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
		int arr[]= {2,9,5,1,3};
		System.out.println("Insertion Sort");
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
		System.out.println();
		InsertionSort(arr);
	}
}
