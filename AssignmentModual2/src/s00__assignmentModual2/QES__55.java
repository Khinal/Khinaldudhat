package s00__assignmentModual2;

import java.util.Scanner;

public class QES__55 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array value");
		int n = in.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter an array values");
		for(int i=0; i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		int temp;
		int start = 0;
		int end = n-1;
		
		while(start<end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			System.out.println("Printing an array after reserve");
			
			for(int j=0; j<n; j++)
			{
				System.out.println(arr[j]);
			}
		}
		
	}

}