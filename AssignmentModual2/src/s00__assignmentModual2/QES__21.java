package s00__assignmentModual2;

import java.util.Scanner;

public class QES__21 {
	
	public static void main(String[] aregs) {
		
		int Marks[] = new int [2];
		int i;
		float total = 0, Avg;
		Scanner Scanner = new Scanner(System.in);
		
		for(i=0; i<2; i++)
		{
			System.out.print("Ennter marks of subject"+(i+1)+":");
			Marks[i] = Scanner.nextInt();
			total = total + Marks[i];
		}
		Scanner.close();
		Avg = total/2;
		System.out.print("The Student  Gread is :");
		if
		(Avg>=91 && Avg<100)
		{
			System.out.print("AA");
		}
		else if
		(Avg>=81 && Avg<90)
		{
			System.out.print("AB");
		}
		else if
		(Avg>=81 && Avg<90)
		{
			System.out.print("AB");
		}
		else if
		(Avg>=81 && Avg<90)
		{
			System.out.print("AB");
		}
		else if
		(Avg>=71 && Avg<80)
		{
			System.out.print("BB");
		}
		else if
		(Avg>=61 && Avg<70)
		{
			System.out.print("BC");
		}
		else if
		(Avg>=51 && Avg<60)
		{
			System.out.print("CD");
		}
		else if
		(Avg>=41 && Avg<50)
		{
			System.out.print("DD");
		}
		if
		(Avg<=40);
			System.out.println("fail");
	}
}
