package String43;
import java.util.HashMap;
import java.util.Map;

public class PrintDuplicatesOfString {

	public static void CountDuplicates(String str){
		HashMap<Character , Integer> ans=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(ans.containsKey(str.charAt(i))) {
				ans.put(str.charAt(i), ans.get(str.charAt(i))+1);
			}
			else {
				ans.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry mapElement:ans.entrySet()) {
			char key=(char)mapElement.getKey();
			int value=(int)(mapElement.getValue());
			
			if(value>1) {
				System.out.println(key+" "+value);
			}	
		}
	}
	
	public static void InsertInput(String str, int[] count) {
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
	}
	
	public static void CountDuplicates2(String str) {
		int count[]=new int[256];
		InsertInput(str,count);
		
		for(int i=0;i<256;i++) {
			if(count[i]>1) {
				System.out.println("Character"+" "+(char)(i)+" "+"Count"+" "+count[i]);
			}
		}
	}
	public static void main(String[] args) {
		String str="GeeksForGeeks";
		CountDuplicates2(str);
	}
}
