package SearchingAndSorting;

public class CountSort {

	public static void CountSort(int arr[], int max, int min) {
		int range=max-min+1;
		int farr[]=new int[range];
		
		for(int i=0;i<arr.length;i++) {
			farr[arr[i]-min]=farr[arr[i]-min]+1;
		}
		
		for(int i=1;i<farr.length;i++) {
			farr[i]=farr[i]+farr[i-1];
		}
		
		int ans[]=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			int val=arr[i];
			int pos=farr[val-min];
			int idx=pos-1;
			ans[idx]=val;
			farr[val-min]--;
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=ans[i];
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		}
		CountSort(arr,max,min);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
