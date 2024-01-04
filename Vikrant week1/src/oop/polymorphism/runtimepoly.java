package oop.polymorphism;

public class runtimepoly {

	public static void main(String[] args) 
	{
		//parent ref & child object
		parent p1=new parent();
		p1.color();//red
		
		System.out.println("**********************");
		
		//child ref & child object
		child c1=new child();
		c1.color();
		
		System.out.println("************************");
		
		//parent ref & child object
		parent p2=new child();
		p2.color();//yellow
		//parent class method is overrided by child class

	}

}
