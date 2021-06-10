
public class MedianOfTwoSortedArray {

	public static int MedianOfArrays(int arr1[], int arr2[],int n1, int n2) {
			int arr3[]=new int[n1+n2];
			int i=0;
			int j=0;
			int k=0;
			while(i<n1&&j<n2) {
				if(arr1[i]<arr2[j]) {
					arr3[k++]=arr1[i++];
				}
				else {
					arr3[k++]=arr2[j++];
				}
			}
			
			while(i<n1) {
				arr3[k++]=arr1[i++];
			}
			
			while(j<n2) {
				arr3[k++]=arr2[j++];
			}
			
			int k1=arr3.length/2-1;
			int k2=k1+1;
			
			return (arr3[k1]+arr3[k2])/2;
	}
	
	public static int MedianOfArrays2(int arr1[],int arr2[], int n1, int n2) {
		int lo=0;
		int hi=n1;
		while(lo<hi) {
			int cut1=lo+(hi-lo)/2 ;
			int cut2=(n1+n2)/2 -cut1;
			int l1=cut1==0?Integer.MIN_VALUE:arr1[cut1-1];
			int l2=cut2==0?Integer.MIN_VALUE:arr2[cut2-1];
			int r1=cut1==n1?Integer.MAX_VALUE:arr1[cut1];
			int r2=cut2==n2?Integer.MAX_VALUE:arr2[cut2];
			if(l1>r2) {
				hi=cut1-1;
			}
			else if(l2>r1){
				lo=cut1+1;
			}
			else {
				return (n1+n2)%2==0?(Math.max(l1, l2)+Math.min(r1, r2))/2:Math.min(r1, r2);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr1[]= {-5,3,6,12,15};
		int arr2[]= {-12,-10,-6,-3,4,10,15};
		int ans=MedianOfArrays2(arr1,arr2,arr1.length,arr2.length);
		System.out.println(ans);
	}
}
