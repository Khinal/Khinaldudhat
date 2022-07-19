package OOPS;

class ERASER
{
	int price = 10;
	String colour = "white";
	static String company = "DOMS";
	
	public void toErase()
	{
		System.out.println(price+" "+colour+" "+company);
	}
	 public static void display()
	 {
		 System.out.println("running display method.........");
	 }

}
	 public class Mainclass01 {
	
	public static void main(String[] args) {
		
		ERASER.company = "Nataraj";
		
		ERASER E1 = new ERASER();
		E1.colour = "Orange";
		E1.company = "Apasra";
		E1.toErase();
		
		ERASER E2 = new ERASER();
		E2.price = 15;
		E2.company = "Natraj";
		E2.toErase();
		
		ERASER.display();
}
}

