package JavaBasics;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "My Name is Tushar";

		String[] s1 = s.split(" ");

		String rev1 = "";

		for (int i = 0; i < s1.length; i++) {
			String word = s1[i];
			String rev = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			rev1 = rev1 + rev + " ";
		}
		System.out.println(rev1);

	}

}
