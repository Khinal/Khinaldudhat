package OOPS;

interface I1
{
	public void display();
	
}

interface I2
{
    int a = 10;
	public void display();
	public void run();
}

class Interdemo
{
	
}
class InterImple extends Interdemo implements I1,I2
{

	@Override
	public void run() {
		
		System.out.println("Running method......");
	}

	@Override
	public void display() {
		
		System.out.println("Running method......");
	}
	
}


public class Interface {

	public static void  main(String[] args) {
	
		final int a = 10;
		
	
	}
}
