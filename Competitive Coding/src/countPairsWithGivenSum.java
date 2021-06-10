import java.util.HashMap;

public class countPairsWithGivenSum {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1};
		int k=2;
		int count=0;
		
		HashMap<Integer,Integer> ans=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!ans.containsKey(arr[i])) {
				ans.put(arr[i], 1);
			}
			else {
				ans.put(arr[i], ans.get(arr[i])+1);
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			int x=k-arr[i];
			if(ans.containsKey(x)) {
				count=count+ans.get(x);
			}
			
			if(k-arr[i]==arr[i]) {
				count=count-1;
			}
		}
		System.out.println(count/2);
	}

}
