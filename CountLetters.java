package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {

	 static HashMap<Character, Integer> getcount(String name) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char c[] = name.toCharArray();
		
		for (int i=0; i<c.length; i++) {
			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);
			} else {
				map.put(c[i], 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {

		HashMap<Character, Integer> map = getcount("army");
		HashMap<Character, Integer> map1 = getcount("ygefgweugseyufdeskuyfsekufygkfygskeu");
		
		if(map.equals(map1)) {
			System.out.println("Anagram");
			
		}
		else
		{
			System.out.println("not Anagram");
		}

	}
}
