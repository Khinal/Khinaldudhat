package OOPS;

class T
{
	T ()
	{
		
		System.out.println("Contructor a calling......");
	}
}

class H extends T
{
	H ()
	{
		
		System.out.println("Conructor b calling........");
	}
	H (String name)
	{
		this();
		System.out.println(name);
	}
}

class G extends H
{
	G()
	{
		super("COUNT");
		System.out.println("Consructor c calling..........");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		G c = new G();
		
	}
}
