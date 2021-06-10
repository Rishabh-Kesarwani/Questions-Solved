package SearchingAndSorting;

public class Sort012 {

	public static void Sort012(int arr[]) {
		int i=0;			// j to i-1 is the region of 1
		int j=0; 			// 0 to j-1 are the region of 0
		int k=arr.length-1; // k+1 to end is the region of 2
		// i to k is the unknown
		
		while(i<arr.length&& i<k) {
			if(arr[i]==1) {
				i++; 
			}
			else if(arr[i]==0){
				swap(arr,i,j);
				j++;
				i++;
			}
			else {
				swap(arr,i,k);
				k--;
			}
		}
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int arr[]= {0,1,2,2,2,1,0,0,2,1,0,1,0,2};
		Sort012(arr);
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
}
