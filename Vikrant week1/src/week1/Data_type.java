package week1;

public class Data_type 
{
		public static void main(String[] args)
	{
		/*Primitive data type system
		 *further mainly classified in two types : - boolean and integral
		 *=================
		 *Boolean - this type of data is used to store just two values for a system like "true " or "False"
		 *Size occupied by this type is ---- 1 bit 
		 */
		
		
		boolean statement=true;
		System.out.println("Boolean Value for Statment:"+statement);
		statement=false;
		System.out.println("Updated Boolean statement:"+statement);
		System.out.println("************************************");
		
		/*Character type of Data
		 * this type is used to store the data in form of single alphabets in upper as well as lower case
		 * and number from 0 to 9, also a special character like @,$ are also stored
		 * it occupied the size of 2 bytes
		 * also there is ascii number technology to store these alphabets the numbers as given below
		 * A to Z - 65 to 90
		 * a to z - 97 to 122
		 * 0 to 9 - 48 to 57
		 */
		
		char c1='b';
		char c2=102;
		char c3=55;
		System.out.println("Single Character:"+c1);
		System.out.println("character from ascii:"+c2);
		System.out.println("charcter from ascii:"+c3);
		System.out.println("************************************");
				
		/*second type of primitive has Integral which is further divided in byte, short, int, long
		 * Byte - it is used to store the number value from -128 to 127
		 * size occupied by the byte is 1 byte
		 * -------------------------------------------
		 * Short - it is used to store the number value from-32768 to 32767
		 * size occupied by short is 2 byte
		 * -------------------------------------------
		 * integer -  it is used to store the 9 digit number from negative to positive
		 * size occupied by int is 4 bytes
		 * -------------------------------------------
		 * long - number greater than 9 digits from negative to positive is stored in long type
		 * it is suffixed by letter "L"
		 * size occupied by long is 8 byte
		 */
		
		byte a=125;
		System.out.println("byte:"+a);
		short b=1245;
		System.out.println("short:"+b);
		int c=2548796;
		System.out.println("Integer:"+c);
		long d=12345678912345L;
		System.out.println("Long:"+d);
		System.out.println("************************************");
		
		
		/*Floating Type
		 * it is used for decimal numbers
		 * further divide in two types float and double
		 * ----------------------------------------------
		 * float is used for lower range number
		 * it occupies 4 byte space and suffixed by "F"
		 * ----------------------------------------------
		 * Double is used for higher range number
		 * it occupies 8 byte space to store data
		 * float can be written as double as it uses more space then it
		 */
		
		float e=78.26F;
		System.out.println("float:"+e);
		double f=4878955756.45;
		System.out.println("double:"+f);
	}

}
