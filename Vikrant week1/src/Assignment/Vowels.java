package Assignment;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) 
	{
		System.out.println("Program started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Character : ");
		String a= sc.nextLine();
		char b=a.charAt(0);
		char v1='a',v2='e',v3='i',v4='o',v5='u';
		char v6='A',v7='E',v8='I',v9='O',v10='U';
		
		if(b==v1||b==v2||b==v3||b==v4||b==v5||b==v6||b==v7||b==v8||b==v9||b==v10)
		{
			System.out.println(" Character is Vowel");
		}
		else
		{
			System.out.println(" Character is Not Vowel");
		}

	}

}
