package OOPS;

class shape
	{
		public void getarea() {
	}
		
	}
	
 class circle extends shape
 {
	 int r;
	 circle (int r)
	 {
	  this.r = r; 
	 }
 @Override
 public void getarea() {
 double area = 3.14*r*r; 
 System.out.println("Area of circle is :"+area);
}
 }
 
 class tringle extends shape
 {

	@Override
	 public void getarea() {
	 float b = 4 , h=13, area;
	 area = (b*h)/2;
	 System.out.println("Area of tringle is :"+area);	 
		 
	 }
 }
 
 class square extends shape
 {
	 @Override
	 public void getarea() {
		 int s= 13;
		 int area_square = s*s;
		 System.out.println("Area of square is : "+area_square);
				
	 }
 }
 
 class rectangle extends shape
 {
	 @Override
	 public void getarea() {
		 double length = 4.5;
		 double width = 8.0;
		 double area = length*width;
		 System.out.println("Area of rectangle is :"+area);
	 }
 }
 

public class Method__OverridingAreafinding {

	public static void main(String[] args) {
		
		circle c = new circle(10);
		c.getarea();
		tringle t = new tringle();
		t.getarea();
		square s = new square();
		s.getarea();
		rectangle r  = new rectangle();
		r.getarea();
	}
}
