package OOPS;


public class Encapsulations {

	public static void main(String[] args) {
		
		Employes em = new Employes();
		em.setId(20);
		em.setName("khinal");
		
		{
			System.out.println(em.getId()+" "+em.getName());
		}
	}
}
