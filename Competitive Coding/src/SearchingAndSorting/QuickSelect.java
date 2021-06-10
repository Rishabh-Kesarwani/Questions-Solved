package SearchingAndSorting;

public class QuickSelect {

	public static int QuickSelect(int arr[], int lo, int hi, int k) {
		
		int pivot=arr[hi];
		int pi=Partition(arr,pivot,lo,hi);
		if(k<pi) {
			return QuickSelect(arr,lo,pi-1,k);
		}
		else if(k>pi){
			return QuickSelect(arr,pi+1,hi,k);
		}
		else {
			return arr[pi];
		}
	}
	
	public static int Partition(int arr[],int pivot, int lo, int hi) {
		int i=lo;
		int j=lo;
		while(i<=hi) {
			if(arr[i]>pivot) {
				i++;
			}
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		return (j-1);   // <= where we increased i&j so pivot element index j-1
	}
	
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int arr[]= {8,3,5,7,6,1,4,2};
		int ans=QuickSelect(arr,0,arr.length-1 ,3);
		System.out.println(ans);
	}
}
