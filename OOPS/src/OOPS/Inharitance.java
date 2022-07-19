package OOPS;

class A  
{
	
		int a = 10;
		public void display()
		
	{
		System.out.println("Running display method......");
	}
}

class B extends A 
{
	public void towrite()
	{
		System.out.println(a);
		System.out.println(super.a);
		System.out.println("Running Display method......");
	}
	
	public void display()
	{
		System.out.println("Writting a book");
		super.display();
		
	}
}

class C extends A
{


}



public class Inharitance {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		B b = new B();
		b.display();
		b.towrite();
		b.display();
		
		C c = new C();
		c.display();
	
	}
}





