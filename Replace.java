package JavaBasics;

import java.util.Arrays;

public class Replace {

	public static void main(String[] args) {
		String s1 = "Nitin";

		// String[] s2= s1.split("");

		// System.out.println(Arrays.toString(s2));
		String s2 = "";
		char ch = 'i';
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ch) {
				s2 = s2 + 'a';
			} else
				s2 = s2 + s1.charAt(i);

		}
		System.out.println(s2);

	}

}
