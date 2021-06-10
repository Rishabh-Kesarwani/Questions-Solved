
public class countTripletSum {

	public static int countTriplets(int arr[],int k) {
		int count=0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int l=j+1;l<arr.length;l++) {
					if(arr[i]+arr[j]+arr[l]==k) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,4,3,6,8,7,5};
		int k=10;
		int ans=countTriplets(arr,k);
		System.out.println(ans);
	}
}
