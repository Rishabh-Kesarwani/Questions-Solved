package SearchingAndSorting;

public class MergeSort {

	public static int[] MergeSort(int arr[], int lo, int hi) {
		if(lo==hi) {
			int res[]=new int[1];
			res[0]=arr[lo];
			return res;
		}
		
		int mid=(lo+hi)/2;
		
		int fsh[]=MergeSort(arr,lo,mid);
		int ssh[]=MergeSort(arr,mid+1,hi);
		int sortedArray[]=MergeTwoSortedArray(fsh,ssh);
		
		return sortedArray;
	}
	
	public static int[] MergeTwoSortedArray(int a[], int b[]) {
		int res[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length&& j<b.length) {
			if(a[i]<b[j]) {
				res[k++]=a[i++];
			}
			else {
				res[k++]=b[j++];
			}
		}
		
		while(i<a.length) {
			res[k++]=a[i++];
		}
		
		while(j<b.length) {
			res[k++]=b[j++];
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int arr[]= {7,4,1,3,6,8,2,5};
		int ans[]=MergeSort(arr,0,arr.length-1);
		for(int elem:ans) {
			System.out.print(elem+" ");
		}
	}
}
