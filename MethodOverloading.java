package OOPSCONCEPT;

public class MethodOverloading {
	public void a() {
		System.out.println("ye hai style");
	}
	public void a(int b) {
		System.out.println("ishq");
	}
	public void a(String c) {
		System.out.println("Tu hi re");
	}
	public void a(int e, String d) {
		System.out.println("o dilbara");
	}
	public int display() {
		return 20;
	}
	

	public static void main(String[] args) {
		MethodOverloading load= new MethodOverloading();
		load.a();
		load.a(20);
		load.a("Tushar");
		load.a(20, null);
		System.out.println(load.display());
		int x= load.display();
		System.out.println(x);
	}

}
