import java.util.Scanner;

public class KandaneAlgorithm {

	public static int KandaneAlgorithm(int arr[]) {
		int n=arr.length;
		int sum=0;
		int max=0;
		for(int i=0;i<n;i++) {
			sum=arr[i];
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(sum>max) {
					max=sum;
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}

		int ans=KandaneAlgorithm(arr);
		System.out.println(ans);
	}

}
