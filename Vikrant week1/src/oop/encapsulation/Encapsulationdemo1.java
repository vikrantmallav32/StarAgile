package oop.encapsulation;

class Employee
{
	private int id=101;
	private String name="Meeta";
	//Access - Public Method for data getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//Business logic
	public void show()
	{
		System.out.println(("Employee id is: "+id));
		System.out.println("Employee name is : "+name);
	}

	
}

public class Encapsulationdemo1 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.show();
		System.out.println("********************");
		//e1.id=201;
		//e1.name="Aarti";----The field Employee.name is not visible
		//to access private data use getter and setter
		e1.setId(301);
		e1.setName("Aarti");
		System.out.println(e1.getId()+" "+e1.getName());
		System.out.println("********************");
		e1.show();
		
				
	}

}
