import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoUnsortedArray {

	public static Set<Integer> findIntersection(int arr1[], int n, int arr2[], int m){
	Set<Integer> temp= new HashSet<Integer>();
	Set<Integer> ans= new HashSet<Integer>();
	int i=0;
	int j=0;
	while(i<n) {
		temp.add(arr1[i++]);
	}
	while(j<m) {
		if(temp.contains(arr2[j])) {
			ans.add(arr2[j]);
			j++;
		}
		else {
			j++;
		}
	}
	
	return ans;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
		}
		int m=s.nextInt();
		int arr2[]=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=s.nextInt();
		}
		Set<Integer> ans=findIntersection(arr1,n,arr2,m);
		Iterator<Integer> it=ans.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
