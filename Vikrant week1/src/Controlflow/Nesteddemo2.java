package Controlflow;

public class Nesteddemo2 {

	public static void main(String[] args) 
	{
		int marks= 78;
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("Grade obtained :- A++");
			}
			else
			{
				System.out.println("Grade obtained :- A");
			}
		}
		else
		{
			System.out.println("Grade obtained :- B");
		}

	}

}
