package JavaBasics;

import java.util.Arrays;

public class StringPrograms {

	public static void main(String[] args) {
		String s= "My Name is Tushar";
		String s1= "";
		
		for(int i=s.length()-1; i>=0; i--) {
			s1= s1+ s.charAt(i);
		}
		System.out.println("The Reverse string is: "+s1);
		
		System.out.println("###Second Program##");
		
		String[] s2= s.split(" ");
		String s3= "";
		//System.out.println(Arrays.toString(s2));
		
		for(int i=s2.length-1; i>=0; i--) {
			s3= s3 + s2[i] + " ";
		}
		System.out.println(s3);
		
		System.out.println("****Third Program***");
		String t= "My Name is Varsha";
		String[] t1= t.split(" ");
		String t3= "";
		
		for(int i=0; i<t1.length; i++) {
			String t2= t1[i];
			for(int j=t2.length()-1; j>=0; j--) {
				t3= t3+ t2.charAt(j);
			}
		}
		System.out.println(t3);
		
		System.out.println("&&&Fourth Program&&&");
		
		char ch= 'a';
		int count= 0;
		for(int i=0; i<t.length(); i++) {
			if(t.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("The count of "+ch+" in the given string is: "+count+" times");
		
		System.out.println(t.toLowerCase());
	}

}
