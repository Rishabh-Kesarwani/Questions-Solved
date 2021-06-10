import java.util.HashSet;
import java.util.Set;

public class subarrayWithSum0 {

	static boolean subarraySum(int arr[]) {
		boolean ans=false;
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==0) {
					ans=true;
					break;
				}
			}
		}
		return ans;
	}
	
//-10 -1 46 -27 -32 -5 -4 1 -29 5 29 38 14 -22 -9 0
	public static void main(String[] args) {
		int arr[]= {-10,-1,46,-27,-32,-5,-4,1,-29,5,29,38,14,-22,-9,0};
		boolean ans=subarraySum(arr);
		System.out.println(ans);
	}
}
