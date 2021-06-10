package SearchingAndSorting;

import java.util.Arrays;

public class TargetSum {

	public static void TargetSum(int arr[], int sum) {
		Arrays.sort(arr);
		int li=0;
		int ri=arr.length-1;
		
		while(li<ri) {
			if(arr[li]+arr[ri]<sum) {
				li++;
			}
			else if(arr[li]+arr[ri]>sum) {
				ri--;
			}
			else {
				System.out.println(arr[li]+" "+ arr[ri]);
				li++;
				ri--;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {7,15,3,18,6,4,19,2,12,11,9};
		TargetSum(arr,15);
	}
}
