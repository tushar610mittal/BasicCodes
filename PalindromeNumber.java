package JavaBasics;

public class PalindromeNumber {
	
	public static void palindrome(int num) {
		int temp,rem;
		int sum=0;
		temp=num;
		
		while(num>0) {
			rem= num%10;
			sum= (sum*10)+rem;
			num= num/10;
		}
		if(temp==sum) 
			System.out.println("Number is Palindrome");
		else 
			System.out.println("Number is not a Palindrome");
		
	}

	public static void main(String[] args) {
		palindrome(454);
		palindrome(100);
		palindrome(1234321);
		
	}

}
