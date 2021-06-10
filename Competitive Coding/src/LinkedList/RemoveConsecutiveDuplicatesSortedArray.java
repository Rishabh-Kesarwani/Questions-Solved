package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class RemoveConsecutiveDuplicatesSortedArray {

	static ArrayList<Integer> RemoveDuplicates(int arr[]){
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				ans.add(arr[i]);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[]= {10,20,20,20,30,30,40};
		List<Integer> ans= RemoveDuplicates(arr);
		for(int elem:ans) {
			System.out.print(elem+" ");
		}
	}

}
