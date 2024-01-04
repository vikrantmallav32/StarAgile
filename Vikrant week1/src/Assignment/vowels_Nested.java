package Assignment;

import java.util.Scanner;

public class vowels_Nested {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		String data=sc.nextLine();
		char ch=data.charAt(0);
		//Nested if
		if(ch=='a')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='e')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='i')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='o')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='A')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='E')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='I')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='O')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='U')
		{
			System.out.println(ch+" is a vowel");
		}
		else
		{
			System.out.println(ch+" is not a vowel");
		}
	}

}
