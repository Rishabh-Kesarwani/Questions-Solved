package String43;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SecondMostRepeatedString {

	public static String secondMostString(String arr[]) {
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		
		Iterator <Map.Entry<String , Integer>> itr= map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String , Integer> entry=itr.next();
			int val=entry.getValue();
			if(val>max) {
				secMax=max;
				max=val;
			}
			else if(val>secMax && val!=max) {
				secMax=val;
			}
		}
		
		itr=map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry=itr.next();
			int val=entry.getValue();
			while(val==secMax) {
				return entry.getKey();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		String arr[]= {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
		String ans=secondMostString(arr);
		System.out.println(ans);
	}
}
