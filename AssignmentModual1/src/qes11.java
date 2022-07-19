import java.util.Scanner;

public class qes11 {

	public static void mian(String[] args) {
		
		int n = 5;
		int temp = n;
		int sum = 0;
		
		for (int i=1; i<3; i++)
		{
			sum = sum+n;
			System.out.println(n);
			n = (n*10)+temp;
		}
		System.out.println(sum);
	}
}
//write a java program that accepts an integer (n) and computers the value of n+nn+nnn.
//input number :5
//5+55+555.