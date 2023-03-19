package JavaBasics;

public class Program2 {

	public static void main(String[] args) {
		String s= "Hi my name is simil";
		String[] str= s.split(" ");
		
		for(int i=0;i<str.length ;i++) {
			for(int j=i+1; j<str.length; j++) {
				System.out.print(str[j]+" ");
				
			}
			System.out.println();
		}
		
		String s1= "Hi my name is simil";
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(s1.length()-5));
		System.out.println(s1.substring(s1.length()/2));
		
	}

}
