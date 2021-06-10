package SearchingAndSorting;

public class SortDate {

	public static void SortDate(String[] arr) {
		CountSort(arr,1000000,100,32);
		CountSort(arr,10000,100,13);
		CountSort(arr,1,10000,2500);
	}
	
	public static void CountSort(String arr[], int div, int mod, int range ) {
		
		int farr[]=new int[range];
		
		for(int i=0;i<arr.length;i++) {
			farr[Integer.parseInt(arr[i],10)/div % mod]++;
		}
		
		for(int i=1;i<farr.length;i++) {
			farr[i]=farr[i]+farr[i-1];
		}
		
		String ans[]=new String[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			int pos=farr[Integer.parseInt(arr[i],10)/div % mod]-1;
			ans[pos]=arr[i];
			farr[Integer.parseInt(arr[i],10)/div % mod]--;
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=ans[i];
		}
		
	}
	
	public static void main(String[] args) {
		String[] arr= {"12041996","20101996","05061997","12041989","11081987"};
		SortDate(arr);
		for(String elem:arr) {
			System.out.println(elem);
		}
	}

}
