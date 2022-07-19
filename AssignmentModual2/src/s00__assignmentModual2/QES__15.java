package s00__assignmentModual2;

class complexNumber{
	
	private final double real;
	private final double imaginary;
	
	public complexNumber(double real , double imaginary ) {
		this.real = real;
		this.imaginary = imaginary;}
	
	public complexNumber sum(complexNumber other) {
		double r = this.real + other.real;
		double i = this.imaginary + other.imaginary;
		return new complexNumber(r,i);}
		
	public complexNumber diffrance(complexNumber other) {
		double r = this.real - other.real;
		double i = this.imaginary - other.imaginary;
		return new complexNumber(r,i);}
		
	    public double getReal()
		{
			return real;
		}
		public double imaginary()
		{
			return imaginary;
		}
		@Override
		public String toString()
		{
			return real +" + " + imaginary + "i";
		}
}
public class QES__15 {
	
	public static void main(String[] args) {
		
		complexNumber c1 = new complexNumber(2,4);
		complexNumber c2 = new complexNumber(3,5);
		
		complexNumber sum = c1.sum(c2);
		complexNumber diffrance = c2.diffrance(c2);
		
		System.out.println("first complexNumber :"+ c1);
		System.out.println("Second complexNumber :"+ c2);
		System.out.println("sum of two complexnumber :"+sum);
		System.out.println("Diffrance of  two complexNumber :"+ diffrance);
}

}
