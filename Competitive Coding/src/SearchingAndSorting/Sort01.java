package SearchingAndSorting;

public class Sort01 {

	public static void Sort01(int arr[]) {
		int i=0;		// from j to i-1 are 1
		int j=0;		// from 0 to j-1 are 0
		// from i to end are unknown
		while(i<arr.length) {
			if(arr[i]==1) {
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
		int arr[]={0,0,1,0,1,0,1,1,0,0,0,1,0};
		Sort01(arr);
		for(int elem:arr) {
			System.out.print(elem+" ") ;
		}
	}
}
