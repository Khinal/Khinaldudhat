
public class ArrayAditional {

	public static void main(String[] args) {
		
		int a[] = {10,2,55,46,67,8,22,37};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			sum += a[i];
			
		}
	    System.out.println("Total :"+sum);
	    System.out.println("Avrage :"+sum/a.length);
	}

}
