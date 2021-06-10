import java.util.HashSet;
import java.util.Set;

public class subsetOfArray {

	public static boolean isSubset(int arr1[], int arr2[]) {
		Set<Integer> ans=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			ans.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(!ans.contains(arr2[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int arr1[]= {10, 5, 2, 23, 19};
		int arr2[]= {19,5,2};
		Boolean ans=isSubset(arr1,arr2);
		System.out.println(ans);
	}
}
