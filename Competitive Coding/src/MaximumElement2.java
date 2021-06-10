import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaximumElement2 {

	public static List<Integer> findMaxm(int arr[]){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		int k=arr.length/3;
		List<Integer> ans=new ArrayList<Integer>();
		for(int elem:map.keySet()) {
			if(map.get(elem)>k) {
				ans.add(elem);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[]= {3,1,2,1,2,1,2,3};
		List<Integer> ans=findMaxm(arr);
		for(int elem:ans) {
			System.out.print(elem+" ");
		}
	}
}
