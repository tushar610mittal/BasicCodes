package JavaBasics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int a= sc.nextInt();
		//System.out.println(a);
		
		System.out.println("Enter 1 char: ");
		char b= sc.next().charAt(0);
		System.out.println("Enter 2 char: ");
		char c= sc.next().charAt(1);
		System.out.println("Enter 3 char: ");
		char d= sc.next().charAt(3);
		
		

	}

}
