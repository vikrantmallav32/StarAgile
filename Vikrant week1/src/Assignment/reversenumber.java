package Assignment;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			int i=num%10;
			rev=rev*10+i;
			num=num/10;
				
		}
		System.out.println("Reversed Number is : "+rev);
		

	}

}
