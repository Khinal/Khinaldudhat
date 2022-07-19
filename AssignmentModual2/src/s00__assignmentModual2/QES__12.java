package s00__assignmentModual2;

class Member {
	
	private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;
    
    public Member
    (String name, int age, String phoneNumber, String address, double salary)
{
    	 this.name = name;
         this.age = age;
         this.phoneNumber = phoneNumber;
         this.address = address;
         this.salary = salary;
}
    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}

class Employee extends Member {
   
	private String specialization;
	public Employee
	
	(String name, int age, String phoneNumber, String address, double salary , String department)
	{
		super(name, age, phoneNumber, address, salary);
    	
    }
}
	
class Manager extends Member {
		
		private String department;
		public Manager
		
		(String name , int age, String phoneNumber , String address , double salary , String department)
		{
			 super(name, age, phoneNumber, address, salary);
		        this.department = department;
		}
}

public class QES__12 {
	
	public static void main(String[] args) {
		
		Employee e = new Employee("pop", 25, "555-555-222", "Home", 20000 ,"IT" );
		Manager m = new Manager("tami", 26, "222-222-444", "town", 30000, "IT");
		e.printSalary();
		m.printSalary();
	
}

}
