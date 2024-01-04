package week1;

public class employerdata 
{
	int id;
	String name;
	
	public void display()
	{
		System.out.println("Employer Id : "+id);
		System.out.println("Employer Name : "+name);
	}
	
	public static void main(String[] args)
	{
		employerdata e1=new employerdata();
		e1.id=101;
		e1.name="Vijay Baban Jadhav";
		e1.display();
		System.out.println("*****************************");
		
		employerdata e2=new employerdata();
		e2.id=102;
		e2.name="Sandip Fakkad Jadhav";
		e2.display();
		System.out.println("*****************************");
		
		employerdata e3=new employerdata();
		e3.id=103;
		e3.name="Sandip Bapu Lanke";
		e3.display();
		System.out.println("*****************************");
		
		employerdata e4=new employerdata();
		e4.id=104;
		e4.name="Akshay Borge";
		e4.display();
		System.out.println("*****************************");
		
		employerdata e5=new employerdata();
		e5.id=105;
		e5.name="Savita Tambe";
		e5.display();
		System.out.println("*****************************");
	}	
}
