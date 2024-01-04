package week1;

public class Thiskeywordforfunctions 
{
	public void m1()
	{
		System.out.println("M1 function is calling to perform......");
		this.m2();// with help of this keyword function m2 is called itself in m1 function and no need to call seperatelly
		
	}
	public void m2()
	{
		System.out.println("M2 Function is calling to perform");
	}
	public static void main(String[] args)
	{
		Thiskeywordforfunctions t1= new Thiskeywordforfunctions();
		t1.m1();
		//t1.m2();
	}
}
