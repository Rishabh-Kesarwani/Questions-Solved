package SearchingAndSorting;

public class PivotElementOfSortedArray {

	public static int FindPivot(int arr[]) {
		int lo=0;
		int hi=arr.length-1;
		
		while(lo<hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]<arr[hi]) {
				hi=mid;
			}
			else {
				lo=mid+1;
			}
		}
		
		return arr[lo];
	}
	
	public static void main(String[] args) {
		int arr[]= {30,40,50,60,10,20};
		int ans=FindPivot(arr);
		System.out.println(ans);
	}
}
