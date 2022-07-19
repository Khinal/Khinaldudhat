package OOPS;

class Student
{
	int id;
	String name;
	
	Student ()
	{
		System.out.println("Constructor calling............");
	}

		Student(int id, String name)
		{
			this.id = id;
			this.name = name;
		}
		
		Student (String a)
		{
			name = a;
		}
		public void display()
		{
			System.out.println(id+" "+name);
		}
	}
 
public class Constructor {
	public static void main(String[] args) {
		
		Student St = new Student(30,"khinal");
		St.display();
	}
}
