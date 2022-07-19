import java.util.Scanner;

public class qes13 {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter value of num: ");
	          int num = sc.nextInt();
	          
		for (int i=1;i<=num;i++)
		{ 
			if  (i%3==0 && i%5==0)
			{
			System.out.println(i+ "is divisible by 3 and 5");
			}
		
			else if (i%3==0)
			{
		System.out.println(i+ "is divisible by 3");
			}
			
			else if (i%5==0)
			{
				System.out.println(i+ "is divisible by 5");
			}
			
			
			else
				{
				System.out.println("invalid number");
				}
		}
		}
	}

// write a java program to print number between 1to100 which are divisible by 3,5 and by both.