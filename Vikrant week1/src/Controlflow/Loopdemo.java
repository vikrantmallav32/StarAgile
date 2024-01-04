package Controlflow;

public class Loopdemo {

	public static void main(String[] args) {
		// for loop
			
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		System.out.println("****************");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("******************");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println("*********************");
		//by default condition is true i.e code will run infinite time
		
		
		//while loop
		int i=1;
		while(i<=5)
		{
			System.out.println("Welcome All");
			i++;
		}
		System.out.println("****************");
		
		//addition of number 123 using while loop i.e 1+2+3=6
		int num=123,r,sum=0;
		while (num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
		}
		System.out.println("Sum of Digit is: " +sum);
		System.out.println("*******************");
		//Do-while loop
		int j=1;
		do
		{
			System.out.println("Hello All");
			j++;
		}while(j<=5);
			
		}
					
	}



	
			
		
	
		
	
	

