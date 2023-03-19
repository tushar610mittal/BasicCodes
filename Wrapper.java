package JavaBasics;

public class Wrapper {

	public static void main(String[] args) {
		String x= "100";
		System.out.println(x+20);
		int i = Integer.parseInt(x);   // string conversion to int
		System.out.println(i+20);
		
		
		System.out.println("******");
		
		// integer to string
		
	int j= 10;
	System.out.println(j+10);
	String y= String.valueOf(j);  // int to string conversion
	System.out.println(y+10);
	
	System.out.println("######");
	
	String s="hello";  
	char c=s.charAt(0);  // string coversion to char at 0 index
	System.out.println(c);
	
	for(int k=0; k<s.length(); k++)
	{
		char d= s.charAt(k);
		System.out.println("the value of "+k+ " index is: "+d); 
		
	}
	}

}
