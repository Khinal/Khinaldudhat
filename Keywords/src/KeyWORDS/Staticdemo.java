package KeyWORDS;

class BCD
{
	static int count = 0;
	BCD()
	{
		count++;
		System.out.println("object created :"+count);
		System.out.println("construction calling.....");
	}
}

public class Staticdemo {
	
	public static void main(String[] args) {
		
		BCD b1 = new BCD();
		BCD b2 = new BCD();
		
	}

}
