import java.util.Arrays;

public class Merge2sortedArray {

	// This code the space complexity is 
	public static void Merge(int arr1[], int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			int j=0;
			if(arr1[i]>arr2[j]) {
				swap(arr1,arr2,i,j);
				for(int k=j+1;k<arr2.length;k++) {
					int l=j;
					if(arr2[k]<arr2[l]) {
						int temp=arr2[l];
						arr2[l]=arr2[k];
						arr2[k]=temp;
						l++;
					}
				}
			}
		}
	}
	
	public static void swap(int arr1[], int arr2[], int i, int j) {
		int temp=arr1[i];
		arr1[i]=arr2[j];
		arr2[j]=temp;
	}
	
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {0,2,6,8,9};
		Merge(arr1,arr2);
		for(int elem:arr1) {
			System.out.print(elem+" ");
		}
		System.out.println();
		for(int elem:arr2) {
			System.out.print(elem+" ");
		}
	}
}
