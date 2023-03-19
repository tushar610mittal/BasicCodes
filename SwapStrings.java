package JavaBasics;

public class SwapStrings {

	public static void main(String[] args) {
		String s1 = "similmittal@gamil.com";
		
		
		String[] arr = s1.split("@");
 		String s2 = "gupta";

		s1 = s1 + s2;
		System.out.println(s1);
		s2 = s1.substring(0, (s1.length() - s2.length()));
		s1 = s1.substring(s2.length());
		System.out.println(s2.length());
		System.out.println(s1 + s2);
	}

}
