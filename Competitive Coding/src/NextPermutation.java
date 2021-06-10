
public class NextPermutation {
	
	public static void Permutation(int arr[]) {
		int i=arr.length-2;
		while(i>=0 && arr[i+1]<=arr[i]) {
			i--;
		}
		if(i>=0) {
			int j=arr.length-1;
			while(j>=0 && arr[j]<=arr[i]) {
				j--;
			}
			swap(arr,i,j);
		}
		reverse(arr,i+1);
	}
	public static void swap(int arr[],int i ,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void reverse(int arr[], int i) {
		int j=arr.length-1;
		while(i<j) {
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,4,3,2};
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
		System.out.println();
		
		Permutation(arr);
		
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
}
