import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

	public static HashSet<Integer> findIntersection(int arr1[], int n,int arr2[], int m){
		int i=0;
		int j=0;
		HashSet<Integer> ans=new HashSet<Integer>();
		while(i<n&& j<m) {
			if(arr1[i]==arr2[j]) {
				ans.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				i++;
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
		HashSet<Integer> ans=findIntersection(arr1,n,arr2,m);
		Iterator<Integer> it=ans.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
