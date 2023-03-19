package JavaBasics;

import java.util.Arrays;

public class StringWords {

	public static void main(String[] args) {
		String s1 = "I Want to go in Automation Testing";
		for(int j=0; j<s1.length(); j++) {
			char d= s1.charAt(j);
			System.out.println(d);

		}
		System.out.println(s1.length());

		String[] s2 = s1.split(" ");
		System.out.println(s2.length);
		//System.out.println(Arrays.toString(s2));

		//System.out.println(s2[1]);
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] != null) {
				count++;
			}
		}
		System.out.println(count);

	}

}
