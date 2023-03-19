package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("My", "Name", "is", "Tushar"));

		System.out.println(ar);

		for (int i = ar.size() - 1; i >= 0; i--) {
			ar1.add(ar.get(i));
			// System.out.println(ar1);
		}
		// System.out.println(ar1);
		System.out.println("After Reversing");

		for (int j = 0; j < ar.size(); j++) {
			System.out.print(ar1.get(j) + " ");
		}
		System.out.println();
		System.out.println(ar1.get(2));
	}

}
