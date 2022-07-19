package s00__assignmentModual2;

class Rectangle1 {
	int  length;
	int breadth;
	
	public Rectangle1(int l , int b) {
		length = l;
		breadth = b;
	}
		
	public void printArea() {
		
		System.out.println(length*breadth);
	}
	public void printPerimeter() {
		
		System.out.println(2*length+breadth);
	
	}
}


class Square1 extends Rectangle1{
	
	int side;
	public Square1 (int s){
		super(s,s);
		
	}
	
}
public class QES__13 {
	
	public static void main(String[] args) {
		
		Rectangle1 r = new Rectangle1(10,5);
		r.printArea();
		r.printPerimeter();
		
		Square1 s = new Square1(10);
		s.printArea();
		s.printPerimeter();
	}

}
