package String43;

import java.util.*;


public class smallestDistinctWindow {

	public static int smallestWindow(String s) {
		int n=s.length();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		int size=Integer.MAX_VALUE;
		int distinctCount=map.size();
		String res="";
		
		for(int i=0;i<n;i++) {
			int count=0;
			int visited[]=new int[256];
			for(int j=0;j<256;j++)
				visited[j]=0;
			String sub_str="";
			for(int j=i;j<n;j++) {
				if(visited[s.charAt(j)]==0) {
					count++;
					visited[s.charAt(j)]=1;
				}
				sub_str+=s.charAt(j);
				if(count==distinctCount) {
					break;
				}
			}
			
			if(sub_str.length()<size && count==distinctCount){
				res=sub_str;
				size=res.length();
			}
		}
		
		return size;
	}
	
	public static void main(String[] args) {
		String s="GEEKSGEEKSFOR";
		int ans=smallestWindow(s);
		System.out.println(ans);

	}

}
