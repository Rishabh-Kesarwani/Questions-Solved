
public class smallestSubarrayWIthSumGreaterThanGivenNumber {

	static int CountMinimumSubarray(int arr[],int k) {
		int mincount=arr.length+1;
		for(int i=0;i<arr.length-1;i++) {
			int currsum=arr[i];
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				currsum=currsum+arr[j];
				count++;
				if(currsum>k&&count<mincount) {
					mincount=count;
				}
			}
		}
		return mincount;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,10,6,5,9,4};
		int k=20;
		int ans=CountMinimumSubarray(arr,k);
		System.out.println(ans);
	}
}
