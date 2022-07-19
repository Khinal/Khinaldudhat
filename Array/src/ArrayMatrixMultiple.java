
public class ArrayMatrixMultiple {

	public static void main(String[] args) {
		
		int a [][] = { {3,4,},{4,1,},{4,2,} };                    //6 16 +==22
		int b [][] = { {2,3},{4,2},{1,1} };                      //9  8 +== 17
		                                                         //8  4 +== 12
		int multi[] [] = new int [3][2];                         //12 2+== 14
		
		for (int i=0; i<2; i++) {
			
			for (int j=0; j<2; j++) {
				
				for (int k=0; k<2; k++) {
					
				multi [i][j] = multi [i][j]+(a[i][k]*b[k][j]);
				
				//for (int i=0; i<2; i++) {
					
				//	for (int j=0; j<2; j++) {
						
				 
					
					System.out.print(multi[i][j] +" ");
						}
					
					System.out.println();
				}
				}
				
				
			}
		
		
	
	}

	

