
public class TrappingRainWaterProblem {

	public static int RainWaterTrapped(int arr[]) {
		if(arr.length<=2) {
			return 0;
		}
		int trappedWater=0;
		for(int i=0;i<arr.length;i++) {
			int leftMax=0;
			int RightMax=0;
			for(int j=0;j<=i;j++) {
				leftMax=Math.max(leftMax, arr[j]);
			}
			for(int j=arr.length-1;j>=i;j--) {
				RightMax=Math.max(RightMax, arr[j]);
			}
			trappedWater=trappedWater+ Math.min(leftMax, RightMax)-arr[i];
		}
		return trappedWater;
	}
	
	public static void main(String[] args) {
		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		int ans=RainWaterTrapped(arr);
		System.out.println(ans);
	}
}
