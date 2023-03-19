package exception;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Bdiya bhai");
		// String s= "N";
		// if(s.equals("N")) {

		try {
			throw new ArithmeticException("Finally did it");
		} catch (Exception  e) {
			e.printStackTrace();
			System.out.println((e.getMessage()));
		}

		System.out.println("Aur bata bhai kaisa h");
	}

}
