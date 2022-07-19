
import java.util.Scanner;

public class ArrayUser {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an arry : ");
        int size = sc.nextInt();
        int a [] = new int[size];
        
        for (int i=0; i< a.length; i++) {
       
        	System.out.println("enter value for index : "+1);
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
        	System.out.println(a[i]);
        }	
        }
}
        




























