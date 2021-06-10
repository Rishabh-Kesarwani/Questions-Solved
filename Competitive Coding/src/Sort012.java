
public class Sort012 {

	public static void sort012(int a[], int n)
    {
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(a[mid]==0){
                mid++;
                low++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else if(a[high]==2) {
                high--;
            }
            else{
                swap(a,mid, high);
                high--;
                if(a[mid]==0 && a[low]==1){
                    swap(a,mid,low);
                    mid++;
                    low++;
                    continue;
                }
                mid++;
            }
        }
    }
    
    public static void swap(int a[], int mid, int high){
        int temp=a[mid];
        a[mid]=a[high];
        a[high]=temp;
    }
	public static void main(String[] args) {
		int arr[]= {0,1,0,2,1,2,2,1,0,0,1,2};
		sort012(arr, arr.length);
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
		
	}

}
