package JavaBasics;

import java.util.Arrays;

public class StringWordReverse {

	public static void main(String[] args) {
		String s = "My Name is Tushar";
//		String[] k = s.split(" ");
	//	// System.out.println(k);
		//System.out.println(Arrays.toString(k));

		//String rev = "";
		//for (int i = k.length - 1; i >= 0; i--) {
		//	rev = rev + k[i] + " ";
		//}
		//System.out.println(rev.trim());
		
		
		char d= s.charAt(1);
		System.out.println(d);
		
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev= rev + s.charAt(i);
		}
		System.out.println(rev);
		

	}

}
