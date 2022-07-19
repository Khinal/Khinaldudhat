package string;

public class StringBufferBuilder {
	
	public static void main(String[] args) {
		
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("this");
		
		for(int i = 0; i<100000; i++)
		{
			sb.append("those");
		}
		double endTime = System.currentTimeMillis();
		
		double startTime1 = System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer("this");
		
		for(int i=0; i<100000; i++)
		{
			sb1.append("those");
			
		}
		double endTime1 = System.currentTimeMillis();
		
		System.out.println("time taken by buffer : "+(endTime-startTime));
		System.out.println("time taken by builder : "+(endTime1-startTime1));
	}

}
