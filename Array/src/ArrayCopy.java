
public class ArrayCopy {

	public static void main(String[] args) {
		
		
		
		
		//int a[] = {10,20,30,40,50,60};
		//int b[] = new int [5];
		
	//	System.arraycopy(a, 1, b, 2, 3);
		
		//for (int i = 0; i < b.length; i++) {
		//System.out.println(b[i]);
		//}
		
		    int a1[] = {10,20,30,40,50,60};
			int a2[] = {1,2,3,4,5,6};
			int b[] = new int[a1.length+a2.length];
			
		for(int i=0;i<a1.length;i++)
			{
				b[i] = a1[i];
			}
			
			for(int i=0;i<a2.length;i++)
			{
				b[a1.length+i] = a2[i];
			}
			
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}

	
}
}
