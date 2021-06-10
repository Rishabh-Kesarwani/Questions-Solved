import java.util.ArrayList;

public class alternativelyArrangeNegPos {

	public static void Rearrange1(int arr[]) {
		ArrayList<Integer> Pos=new ArrayList<Integer>();
		ArrayList<Integer> Neg=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				Neg.add(arr[i]);
			}
			else {
				Pos.add(arr[i]);
			}
		}
		int i=0,j=0,k=0;
		while(i<Pos.size()&&j<Neg.size()) {
			arr[k++]=Pos.get(i++);
			arr[k++]=Neg.get(j++);
		}
		while(i<Pos.size()) {
			arr[k++]=Pos.get(i++);
		}
		while(j<Neg.size()) {
			arr[k++]=Neg.get(j++);
		}
	}
	
	public static void Rearrange2(int arr[]) {
		int pivot=0;
		int i=0,j=-1;
		while(i<arr.length) {
			if(arr[i]>pivot) {
				i++;
			}
			else {
				j++;
				swap(arr,i,j);
				i++;
			}
		}
		j=j+1;
		i=0;
		while(i<=j) {
			swap(arr,i,j);
			i=i+2;
			j=j+1;
		}
	}

	public static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,-2,-4,-5,6,2,-9,1,6,9};
		Rearrange1(arr);
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}
}
