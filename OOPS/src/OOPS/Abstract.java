package OOPS;

abstract class Abs
{
	public abstract void display();

    public void run()
    {
    	System.out.println("Running run method............");
    }
}

class AbsImple extends Abs
{

	@Override
	public void display() {
		System.out.println("Running display method....");
		
	}

}

public class Abstract {

	public static void main(String[] args) {
		
		AbsImple abs = new AbsImple();
		abs.display();
		abs.run();
		
	}
}

