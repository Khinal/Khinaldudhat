package s00__assignmentModual2;

public class QES__47 {
	
	public static void main(String[] args) {
		
		int array [] = new int [] {6,8,4,2,5};
		int temp = 0;
		
		System.out.println("Elements of orignal array");
		for(int  i=0; i<array.length;i++) {
		
			System.out.println(array[i]+" ");
		}
		for(int i=0; i<array.length; i++){
		
	    for(int j=i+1; j<array.length; i++){
	    	
	    	if(array[i]>array[j])
	    	{
	    		temp = array[i];
	    		array[i] = array[j];
	    		array[j] = temp;
	    	}
	    }
		}
		
		System.out.println();
		System.out.println("Element of sorted array");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]+" ");
		}
	}

}
