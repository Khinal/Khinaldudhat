package OOPS;

class value {
	
	public void display()
	{
		System.out.println("Running display method.....");
	}
	public void arrayadd (int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
		public int [] revArray (int a[])
		{
			int c[] = new int [a.length];
			int d = 0;
			for (int i=a.length-1; i>0; i--) {
				c[d] =a [i];
				d++;
			}
			return c;
		}
	}


public class Method__003 {
	
	public static void main(String[] args) {
		
		value va = new value();
		int b[] = {10,20,30,40,50};
		va.arrayadd(b);
		System.out.println("****************");
		int d[] = {10,20,30,40,50};
		va.arrayadd(d);
	}
}
