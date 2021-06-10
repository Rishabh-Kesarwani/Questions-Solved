
public class shiftzero {

	public static void ResetArray(int arr[]) {
		int i=0;
		int j=0;
		
		// 0 to j-1 -> 0
		// j to i  -> any no apart from zero
		// i to arr.length -> unknown
		
		while(i<arr.length) {
			if(arr[i]!=0) {
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
		int arr[]= {1,2,-3,0,3,0,-5,7,0,3,0,9}; // Input array
		ResetArray(arr);
		for(int elem: arr) {
			System.out.print(elem+" ");
		}
	}
}
