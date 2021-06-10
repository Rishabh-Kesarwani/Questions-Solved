import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class longestConsecutiveSubsequence {

	public static int longestSubsequence(int arr[]) {
		int ans=0,count=0;
		Arrays.sort(arr);
		ArrayList<Integer> v=new ArrayList<>();
		v.add(-1);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				v.add(arr[i]);
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i>0&& v.get(i)==v.get(i-1)+1) {
				count++;
			}
			else {
				count=1;
			}
			ans=Math.max(ans, count);
					
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[]= {10,5,9,1,11,8,6,15,3,12,2};
		int ans=longestSubsequence(arr);
		System.out.println(ans);
	}
}
//		HashMap<Integer, Boolean> map=new HashMap<>();
//		
//		for(int val:arr) {
//			map.put(val, true);
//		}
//		
//		for(int val:arr) {
//			if(map.containsKey(val-1)){
//				map.put(val, false);
//			}
//		}
//		
//		int msp=0;
//		int ml=0;
//		
//		for(int val:arr) {
//			if(map.get(val)==true) {
//				int tl=1;
//				int tsp=val;
//			
//			while(map.containsKey(val+tl)) {
//				tl++;
//			}
//			
//			if(tl>ml) {
//				msp=tsp;
//				ml=tl;
//			}
//			}
//		}
//		System.out.print(msp+" "+ml);

