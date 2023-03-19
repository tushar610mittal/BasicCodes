package JavaBasics;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Tushar");
		h1.put(2, "Mittal");
		h1.put(3, "Vishi");
		h1.put(4, "Mehak");
		// h1.put(null,"Sona");
		// h1.put(8,null);
		// h1.put(9,null);
		System.out.println(h1.get(8));
		System.out.println(h1.get(null));
		System.out.println(h1.get(3));

		 h1.forEach((k,v)-> {System.out.println(k+v);});
		HashMap<Integer, String> h2 = new HashMap<Integer, String>();
		h2.put(1, "Tushar");
		h2.put(2, "Mittal");
		h2.put(3, "Vishi");
		h2.put(4, "Soni");
		// h2.put(5, "Simil");
		System.out.println(h1.equals(h2));
		System.out.println(h1.keySet().equals(h2.keySet()));
	}

}
