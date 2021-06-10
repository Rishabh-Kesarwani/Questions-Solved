import java.math.BigInteger;

public class factorialOfBigNumber {

	public static void main(String[] args) {
		BigInteger f=new BigInteger("1");
		int n=40;
		for(int i=2;i<=n;i++) {
			f=f.multiply(BigInteger.valueOf(i));
		}
		System.out.println(f);
	}
}

