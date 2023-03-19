package JavaBasics;

import java.util.HashMap;

public class StringFunction1 {
	
	public static void count() {
		String s= "aaaabbbcccyydds";
		char[] c= s.toCharArray();
		
		HashMap<Character,Integer> hs= new HashMap<Character,Integer>();
		for(char i: c) {
			if(hs.containsKey(i)) {
				hs.put(i, hs.get(i)+1);
			}else {
				hs.put(i, 1);
			}
		}
		System.out.println(hs);
	}

	public static void main(String[] args) {
		count();
		
		
	}

}
