package JavaBasics;

public class Factorial {

	public static void main(String[] args) {
		fact(6);
		String s = "Simil";
		
		System.out.println(s.length());
		
		
	}
	public static void fact(int num)
	{
		int sum= num;
		for(int j=1;j<num;j++)
		{
		   sum= sum*j;
			
		}
		System.out.println(sum);
	}

}


