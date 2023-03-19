package JavaBasics;

public class StaticVsNonStatic {
	
	public static String display() {
		String s= "Tushar";
		return s;
	}

	public static void main(String[] args) {
		String s1= display();
		System.out.println(s1);
		System.out.println(display()+"Mittal");
		Sample.show();
		System.out.println(Sample.i);
		StaticVsNonStatic s= new StaticVsNonStatic();
		Sample v= new Sample();
		v.display();
		System.out.println(v.j);
		v.show();
		

	}
	
}
 
class Sample
{
static int i= 25;
int j= 20, k=30;
public void display()  //non-static method
{
    System.out.println("The value of j and k are:" +j +" " +k);
}
public static void show()  // static method
{
    System.out.println("The static value is:" +i);
}
}