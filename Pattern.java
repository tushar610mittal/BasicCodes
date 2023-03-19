package JavaBasics;

public class Pattern {

	public static void main(String[] args) {
		int c=1;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=i; j++, c+=2) {
				System.out.print(c+ " ");
			}
			System.out.println();
		}
	}

}
