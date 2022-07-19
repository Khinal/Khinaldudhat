
public class qes3 {

	public static void main(String[] args) {
		
		int year=2018;
		
		if(year%4==0) {
			
			System.out.println("Leap Year");
		}
		else if (year%4==0 && year%1!=0) {
			
			System.out.println("Leap Year");
		}
		
		else 
		{
			System.out.println("Not a Leap Year");
		}
	}
}
// write a java program that takes a year from user  and print whether  that  year is leap 
// year or not.