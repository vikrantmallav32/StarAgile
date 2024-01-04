package Controlflow;

import java.util.Scanner;

public class switchcasedemo2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Charcter");
		String a=sc.nextLine();
		
		char ch=a.charAt(0);
		switch (ch) {
		case 'a':
			System.out.println(ch+ " is a Vowel");
			break;
		case 'e':
			System.out.println(ch+ " is a Vowel");
			break;
		case 'i':
			System.out.println(ch+ " is a Vowel");
			break;
		case 'o':
			System.out.println(ch+ " is a Vowel");
			break;
		case 'u':
			System.out.println(ch+ " is a Vowel");
			break;

		default:
			System.out.println(ch+" is not a vowel");
			break;
		}

	}

}
