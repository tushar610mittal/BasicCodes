package OOPSCONCEPT;

public class Child extends Parent {
	void dance()   //method overriding
	{
		System.out.println("Dance good as parent");
	}
	void play()
	{
		System.out.println("plays badminton and cricket");
	}
	void sing()
	{
		System.out.println("A+");
	}
	public static void main(String[] args)
	{
		Child c= new Child();
		c.dance();       // compile time polymorphism
		c.play();
		c.cook();
		c.hieght();
		System.out.println("######");
		
		Parent p= new Child(); // child class object can be refrenced by parent class refrence variable
		p.dance();  // run time polymorphism
		p.cook();
		p.hieght();
	}

}
