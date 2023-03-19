package OOPSCONCEPT;

public class TestInterface implements SbiBank, HdfcBank { // Multiple inheritence through interface

	public void credit() {
		System.out.println("Credit function");
	}

	public void debit() {
		System.out.println("debit function");
	}

	public void MutualFund() {
		System.out.println("Mutual fund balance*");
	}

	public void Balance() {
		System.out.println("Balance");
	}

	public void display() {
		System.out.println("Display all functions");
	}

	public static void main(String[] args) {
		SbiBank b = new TestInterface();
		b.credit(); // Run time polymorphism or dynamic
		b.debit();
		System.out.println("$$$$$$");
		HdfcBank h = new TestInterface();
		h.MutualFund();
		h.Balance();
		System.out.println("*******");
		TestInterface t = new TestInterface();
		t.display();
		t.Balance();
		t.credit();
		System.out.println(blnc);

	}

}

interface SbiBank {
	public void credit();

	public void debit();

}

interface HdfcBank {
	public void MutualFund();

	public void Balance();

	float blnc = 200;
}
