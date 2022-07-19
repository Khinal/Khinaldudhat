package OOPS;

class Test
{
	public void display()

	{
		System.out.println("Running display method....");
	}
	public void add (int a, int b)
	{
		int result = a+b;
		System.out.println("Result is : "+result);
	}
}

public class Method__001 {

	public static void main(String[] args) {
		
		Test ts = new Test();
		ts.display();
		ts.add(50, 10);
		ts.add(30, 10);
		
		
	}
}


