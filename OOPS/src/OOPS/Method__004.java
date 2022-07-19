package OOPS;

class number{
	
	public void dispaly()
	{
		System.out.println("Running dispaly method........");
	}
	public void arrayadd(int a[])
	{
		int sum = 0;
		for (int i=0; i<a.length; i++)
		{
			sum += a [i];
			System.out.println("sum of an array is :"+sum);
		}
		}
	public void num(int...a)
	{
		for (int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

public class Method__004 {

	public static void main(String[] args) {
		
		number n = new number();
		n.dispaly();
		
		int a[] = {10,20,10,20,10};
		n.arrayadd(a);
		
		n.num(10,20,30,40,50);
	}
}
