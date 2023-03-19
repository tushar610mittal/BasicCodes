package JavaBasics;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {

		String[] a = { "3", "5", "7", "6", "4" };
		int size = a.length;
		int[] n = new int[size];

		for (int i = 0; i < size; i++) {
			n[i] = Integer.parseInt(a[i]);
		}
		System.out.println(Arrays.toString(n));

		int temp;
		for (int i = 0; i < size; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (n[i] < n[j]) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		for(int i=0; i<size; i++) {
			System.out.println(n[i]);
		}
		
		String s= Arrays.toString(n);
		System.out.println(s);

	}
}