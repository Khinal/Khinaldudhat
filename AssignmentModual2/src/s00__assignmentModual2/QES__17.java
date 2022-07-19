package s00__assignmentModual2;

abstract class Bank{
	
	public abstract void getBalance();
	
}

class BankA extends Bank{
	
	@Override
	public void getBalance() {
		System.out.println("$100");
	}
}
	
class BankB extends Bank{
	
	@Override
	public void getBalance() {
		System.out.println("$150");
	}
}

class BankC extends Bank{
	@Override
	public void getBalance() {
		System.out.println("$200");
	}
}

public class QES__17 {
	
	public static void main(String[] args) {
		
		BankA b = new BankA();
		b.getBalance();
		
		BankB b1 = new BankB();
		b1.getBalance();
		
		BankC b2 = new BankC();
		b2.getBalance();
				
	}
}
