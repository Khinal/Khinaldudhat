package string;


public class Basicdemostring {

	public static void main(String[] args) {
		
		//String str = "Hello java";
		//String str1 = new String("Hello php");
		//String s = str.concat("Hello php");
		//System.out.println(s);
		
		String s1 = "java";
		String s2 = "php";
		String s3 = "java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		
		System.out.println("***********************");
		
		String str1 = new String("java");
		String str2 = new String("php");
		String str3 = new String("java");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
	}
}
