package Assignment;

import java.util.Scanner;

public class swapnumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Variable a:");
		int a=sc.nextInt();
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter Variable b:");
		int b=vc.nextInt();
		System.out.println("Befor Swapping a="+a+" and b="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping a="+a+ " and b="+b);
		}

}
