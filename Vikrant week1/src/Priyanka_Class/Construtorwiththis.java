package Priyanka_Class;

public class Construtorwiththis 
{
		//instance variable
		int id;
		String name;
		
		//constructor-parameterized
		public Construtorwiththis(int id,String name)//local
		{
			//name conflict
//			id=id;
//			name=name;
			//current class variable=local variable
			this.id=id;
			this.name=name;
			
		}
		//method
		public void show()
		{
			System.out.println("Student id is: "+id);
			System.out.println("Student name: "+name);
		}
		
		
		
		
	//execution
		public static void main(String[] args)
		{
			Construtorwiththis c1=new Construtorwiththis(101,"Parag");
			c1.show();
		}

	

}
