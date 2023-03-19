package JavaBasics;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Tushar";
		String nstr = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			nstr =  c + nstr;
			System.out.println("The new string is " + nstr);

		}
		System.out.println("The new string is " + nstr);

		String[][] str = new String[3][5];
		// System.out.println(str.length);
		// System.out.println(str[0].length); // for every row there are same number of
		// column
	}

}
