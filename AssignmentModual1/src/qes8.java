import java.util.Scanner;

public class qes8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		
		int a = sc.nextInt();
		int count = 0;
		while (a>0)
		{
			a = a/10;
			count++;
		}
		
		System.out.println("Number of digits :"+count);
		

	}
}

//write a java program that reads a positive integer and count the number of digits the number.
//input an integer number less than ten billon:125463 number of digits in the number :6.














//input an integer number: 125463
//number of digits in numb 6