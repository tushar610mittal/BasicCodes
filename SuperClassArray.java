package JavaBasics;

public class SuperClassArray {

	public static void main(String[] args) {
		Object obj[] = new Object[3];

		Object obj1[] = { "Tushar", 1610, 10.0, "6-10-1993" };
		obj[0] = 16;
		obj[1] = "Tushar";
		obj[2] = "16-10-1992";

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}

		for (int j = 0; j < obj1.length; j++) {
			System.out.print(obj1[j] + " ");
		}
		// Sample.show();
	}

}
