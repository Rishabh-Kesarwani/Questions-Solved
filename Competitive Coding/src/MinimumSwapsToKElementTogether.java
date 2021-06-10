
public class MinimumSwapsToKElementTogether {

	public static int countSwaps(int arr[],int k) {
		int ltk=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=k) {
				ltk++;
			}
		}
		int minCount=Integer.MAX_VALUE;
		for(int i=0;i<arr.length-ltk;i++) {
			int count=0;
			for(int j=i;j<=i+ltk-1;j++) {
				if(arr[j]>k) {
					count++;
				}
			}
			if(count<minCount) {
				minCount=count;
			}
		}
		return minCount;
	}
	
	public static void main(String[] args) {
		int arr[]= {2, 7, 9, 5, 8, 7, 4};
		int k=6;
		int ans=countSwaps(arr,k);
		System.out.println(ans);
	}
}
