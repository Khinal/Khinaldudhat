package OOPS;

class multiplication
{
	public int Square (int a)
	{
		int Square = a*a;
		return Square;
	}

}

public class Method__002 {
	
	public static void main(String[] args) {
		
		multiplication mt = new multiplication();
		
		int a  = mt.Square(5);
		int b =  mt.Square(7);
		System.out.println(a);
		System.out.println(b);
	}

}
