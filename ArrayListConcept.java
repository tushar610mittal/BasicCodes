package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(16);
		ar.add("OCT");
		ar.add("Tushar");
		System.out.println(ar.size());
		ar.add("Varsha");
		ar.remove(1);
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		System.out.println(ar);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		for(Object obj: ar) {
			System.out.print(obj);
			
		}
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); // add only integer values

	}

}
