package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static boolean sorted(ArrayList<Integer> ar1) {
		for (int i = 0; i < ar1.size(); i++) {
			if (ar1.get(i) > ar1.get(i + 1)) {
				return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(50,40,10, 50, 30, 20, 5));

		System.out.println(sorted(ar));

	}
}