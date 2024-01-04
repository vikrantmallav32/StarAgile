package Controlflow;

public class forloopwithif {

	public static void main(String[] args) 
	{
		//for loop with if condition
		/* 
		 * print all even number upto 25
		 */
		for(int i=1;i<=25;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i);
			}
		}
		System.out.println("*****************");
		//Nested for loop
		//Print table of 2
		
		for(int i=1;i<=10;i++)
		{
			for(int k=1;k<=10;k++)
			{
				System.out.print(i*k+"\t");
			}
			System.out.println();
		}
	}

}
