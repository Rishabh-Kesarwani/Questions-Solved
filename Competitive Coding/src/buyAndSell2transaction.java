
public class buyAndSell2transaction {

	public static int MaxProfit(int arr[]) {
		int mpist=0;
		int leastsf=arr[0];
		int dpl[]=new int[arr.length];
		//dpl[0]=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<leastsf) {
				leastsf=arr[i];
			}
			mpist=arr[i]-leastsf;
			if(mpist>dpl[i-1]) {
				dpl[i]=mpist;
			}
			else {
				dpl[i]=dpl[i-1];
			}
		}
		
		int mpibt=0;
		int maxsf=arr[arr.length-1];
		int dpr[]=new int[arr.length];
		//dpr[arr.length-1]=0;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>maxsf) {
				maxsf=arr[i];
			}
			mpibt=maxsf-arr[i];
			if(mpibt>dpr[i+1]) {
				dpr[i]=mpibt;
			}
			else {
				dpr[i]=dpr[i+1];
			}
		}
		
		int op=0;
		for(int i=0;i<arr.length;i++) {
			if(dpl[i]+dpr[i]>op) {
				op=dpl[i]+dpr[i];
			}
		}
		return op;
	}
	
	public static int MaxProfit2(int arr[]) {
		int buy1,buy2,profit1,profit2;
		buy1=Integer.MAX_VALUE;
		buy2=Integer.MAX_VALUE;
		profit1=0;
		profit2=0;
		for(int i=0;i<arr.length;i++) {
			buy1=Math.min(arr[i], buy1);
			profit1=Math.max(profit1, arr[i]-buy1);
			buy2=Math.min(buy2, arr[i]-profit1);
			profit2=Math.max(profit2, arr[i]-buy2);
		}
		return profit2;
	}
	public static void main(String[] args) {
		int arr[]= {30,40,43,50,45,20,26,40,80,50,30,15,10,20,40,45,71,50,55};
		int ans=MaxProfit2(arr);
		System.out.println(ans);
	}

}
