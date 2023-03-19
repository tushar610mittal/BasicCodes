package JavaBasics;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("--------");
		for(int p=1; p<=5; p++) {
			for(int q=5; q>=p; q--) {
				System.out.print(q);
			}
			System.out.println();
		}
		System.out.println("--------");
		for(int k=5; k>0; k--) {
			for(int l=1; l<=k; l++) {
				System.out.print("*");
			}
			System.out.println(" ");
	}

}
}
