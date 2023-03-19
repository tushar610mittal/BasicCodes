package JavaBasics;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		String s= "my name is simil my simil.simil hi hello!simil what are..Simil";
		
		String s1= "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='.' || s.charAt(i)=='!') {
				s1=s1+ ' ';	
			}
			else
				s1=s1+ s.charAt(i);
		}
		System.out.println(s1);
		String[] str= s1.split(" ");
		System.out.println(Arrays.toString(str));
		
		int count=0;
		for(int i=0; i<str.length; i++) {
			if(str[i].equals("simil"))
				count++;
		}
		System.out.println(count);
	}

}
