package oop.inheritance;
class A
{
	public void m1()
	{
		System.out.println("M1 is Calling from A class");
	}
}
class B extends A//A is parent of B - single level inhertiance
{
	public void m2()
	{
		System.out.println("M2 is Calling from B class");
	}
}
class C extends B//A is parent of B is Parent of C - Multi Level Inheritance
{
	public void m3()
	{
		System.out.println("M3 Method is Calling from C Class");
	}
}

class D extends A//A is parent of B - Herachical inhertiance
{
	public void m4()
	{
		System.out.println("M4 is Calling from D class");
	}
}

class X extends B//,D to make multiple inheritance we use interface
{
	public void m5()
	{
		System.out.println("M5 is calling from X Class");
	}
}

public class InheritanceDemo1 
{

		public static void main(String[] args) 
	{
		System.out.println("Parent Ref and Parent Object");
			
		A a1=new A();
		a1.m1();
		
		System.out.println("***************");
		System.out.println("Child Ref and Child Object");
		
		
		B b1=new B();
		b1.m2();//individual method
		b1.m1();//inherited method
		
		System.out.println("***************");
		System.out.println("Parent ref and child object");
		
		A b2=new B();
		b2.m1();
		
		System.out.println("********************");
		
		C c1=new C();
		c1.m3();//individual method
		c1.m2();//inherited method - from b
		c1.m1();//inhertied method - from a
		
		
		System.out.println("****************");
		
		
		D d1=new D();
		d1.m4();
		d1.m1();

	}

}
