package Assignment;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) 
	{
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the Factorial number: ");
		int data=num.nextInt();
		int i=1, l=1;
		while(i<=data)
		{
			l=l*i;
			i++;
		}
		System.out.println("Factorial of given number is "+l);
		
	}

}
