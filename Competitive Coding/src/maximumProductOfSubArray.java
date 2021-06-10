
public class maximumProductOfSubArray {

	public static int maxmProduct(int arr[]) {
		int omax=arr[0];
		int maxEnd=arr[0];
		int minEnd=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==0) {
				maxEnd=1;
				minEnd=1;
				continue;
			}
			
			int temp=maxEnd;
			maxEnd=Math.max(arr[i], Math.max(arr[i]*maxEnd, arr[i]*minEnd));
			minEnd=Math.min(arr[i], Math.min(arr[i]*temp, arr[i]*minEnd));
			if(maxEnd>omax) {
				omax=maxEnd;
			}
		}
		return omax;
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {6,-5};
		int MaxProduct=maxmProduct(arr);
		System.out.println(MaxProduct);
	}
}
