package JavaBasics;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		String s = "my name is simil my simil simil hi hello simil what are Simil";
		String[] str = s.split(" ");
		System.out.println(Arrays.toString(str));

		int count = 0;
		//String word= "simil";
		for (int i = 0; i < str.length; i++) {
			if (str[i].equalsIgnoreCase("simil"))
				count++;
			

		}
		System.out.println(count);

	}
}
