package Assignment;

public class array_password {

	public static void main(String[] args) 
	{
		Object user[][]= {{"Admin","Admin123"},{"Pranali","test123"},{"sanket","pass123"},{"suresh","pass@123"},{"vikrant","bullshit"}};
		
		for(Object i[]:user)
		{
			for(Object j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("***********************************");
		for(int i=0;i<user.length;i++)
		{
			for(int j=0;j<user[1].length;j++)
			{
				System.out.print(user[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
