package JavaBasics;

class construct1 {

	public construct1() {

		System.out.println("first1");

	}

	public construct1(int a) {

		System.out.println("first2");

	}
}

class construct3 extends construct{
	public construct3() {
		System.out.println("Second2");
	}
}

public class construct extends construct1 {

	public construct() {
		super(10);
		System.out.println("first");
	}

	public construct(int a) {
		System.out.println("Second");
	}
	
	public static void main(String[] args) {
		construct3 ab = new construct3();
	}

}
