import java.util.HashSet;

public class repeatedElementInArray {

	public static int repeatedTimes(int nums[]) {
		HashSet<Integer> ans=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(ans.contains(nums[i])) {
				return nums[i];
			}
			ans.add(nums[i]);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int nums[]= {3,1,3,4,2};
		System.out.println(repeatedTimes(nums));

	}

}
