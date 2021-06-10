package SearchingAndSorting;

public class RadixSort {

	public static void RadixSort(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		int exp=1;
		while(exp<=max) {
			CountSort(arr,exp);
			exp=exp*10;
		}
	}
	
	public static void CountSort(int arr[], int exp) {
		int range=10;
		int farr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			farr[arr[i]/exp %10]=farr[arr[i]/exp %10]+1;
		}
		
		for(int i=1;i<farr.length;i++) {
			farr[i]=farr[i]+farr[i-1];
		}
		
		int ans[]=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			int val=arr[i];
			int pos=farr[arr[i]/exp %10];
			int idx=pos-1;
			ans[idx]=val;
			farr[arr[i]/exp %10]--;
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=ans[i];
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {213,97,718,123,37,443,982,64,375,683};
		RadixSort(arr);
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
}
