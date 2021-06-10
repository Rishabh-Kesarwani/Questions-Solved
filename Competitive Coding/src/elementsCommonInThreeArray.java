import java.util.*;
public class elementsCommonInThreeArray {

	public static ArrayList<Integer> commonElements(int arr1[], int arr2[], int arr3[]){
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				for(int k=0;k<arr3.length;k++) {
					if(arr1[i]==arr2[j]&& arr2[j]==arr3[k]) {
						if(!ans.contains(arr1[i])){
						     ans.add(arr1[i]);
						}
					}
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {2,3,4,5,6};
		int arr3[]= {3,4,5,6,7};
		ArrayList<Integer> ans=commonElements(arr1,arr2,arr3);
		for(int elem:ans) {
			System.out.print(elem+" ");
		}
	}

}
