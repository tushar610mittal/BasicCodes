package JavaBasics;

public class PrimeNumber {

	public static void main(String[] args) {
		//System.out.println(primenumber(599));
		 display(100);

	}

	public static boolean primenumber(int num) {
		boolean plindrome = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				plindrome = false;
				break;
			}

		}
		return plindrome;

	}

	public static void display(int num) {
		for (int j = 2; j < num; j++) {
			if (primenumber(j))
				System.out.print(j+" ");
		}

	}

}
