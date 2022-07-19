package string;

public class Stringmethod {

	public static void main(String[] args) {
		
		String str = "Sun rises in east";
		
		System.out.println("Length :"+str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('h'));
		System.out.println(str.replace("o", "f"));
		System.out.println(str.substring(6));
		System.out.println(str.subSequence(6, 11));
		System.out.println(str.trim());
		
		
		
		
	}
}
