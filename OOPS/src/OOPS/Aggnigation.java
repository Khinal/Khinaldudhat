package OOPS;

class sample
{
	public void display()
	{
		System.out.println("running display method.....");
	}
}

class run
{
	static sample sample = new sample();
	public void getdata()
	{
		System.out.println("running get data");
	}
}


public class Aggnigation {
 
	public static void main(String[] args) {
		
		run.sample.display();
		System.out.println("java");
		System.err.println("php");
		
	}
}
