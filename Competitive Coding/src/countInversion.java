
public class countInversion {

//	public static int countInversion(int arr[]) {
//		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					count++;
//				}
//			}
//		}
//		return count;
//	}
	
	public static int countInversion(int arr[]) {
		
		int ans=mergeSort(arr,0,arr.length-1);
		return ans;
	}
	
	public static int mergeSort(int arr[], int si, int ei) {
		int inv=0;
		if(si>=ei) {
			return 0;
		}
		int mid=(si+ei)/2;
		inv+=mergeSort(arr, si, mid);
		inv+=mergeSort(arr,mid+1,ei);
		inv=inv+merge(arr,si,ei);
		
		return inv;
	}
	
	public static int merge(int input[],int si, int ei) {
		int inv=0;
		int mid=(si+ei)/2;
		int arr[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei) {
			if(input[i]<=input[j]) {
				arr[k]=input[i];
				i++;
				k++;
			}
			else {
				arr[k]=input[j];
				j++;
				k++;
				inv=inv +mid+1-i;
			}
		}
		
		while(i<=mid) {
			arr[k++]=input[i++];
		}
		while(j<=ei) {
			arr[k++]=input[j++];
		}
		
		for(int x=0;x<arr.length;x++) {
			input[si+x]=arr[x];
		}
		return inv;
	}
	
	public static void main(String[] args) {
		int arr[]= {42,11,5,17,19,3,19,45,27,23};
		int ans=countInversion(arr);
		System.out.println(ans);
		
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
}
