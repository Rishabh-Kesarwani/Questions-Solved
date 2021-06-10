package String43;

public class flipsToMakeBinaryCoinAlternate {

	static char flip(char ch) {
		return (ch=='0')?'1':'0';
	}
	
	public static int flipBinaryCoin(String coin, char expected) {
		int flipcoins=0;
		for(int i=0;i<coin.length();i++) {
			if(coin.charAt(i)!=expected)
				flipcoins++;
			expected=flip(expected);
		}
		return flipcoins;
	}
	
	public static int flipCoins(String coin) {
		return Math.min(flipBinaryCoin(coin,'0'), flipBinaryCoin(coin,'1'));
	}
	
	public static void main(String[] args) {
		String coin="001";
		int ans=flipCoins(coin);
		System.out.println(ans);

	}

}
