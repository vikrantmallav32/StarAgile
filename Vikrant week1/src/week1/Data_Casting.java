package week1;

public class Data_Casting 
{
	public static void main(String[] args)
	{
		/*casting is meant to be changing data type from one form to other
		 * mainly three data type is converted
		 * 1. primitive to primitive
		 * 2. primitive to object
		 * 3. object to primitive
		 * -----------------------------------------
		 * 1. primitive to primitive is divide in two types
		 * 1. implicit
		 * it can be refer as automatic conversion of data type
		 * as we know smaller size data type can be easily converted into larger size
		 * here conversion can takes plase as
		 * byte ---> short--->int--->long---->float--->double
		 * 1 byte--->2 byte--->4byte--->8byte--->4byte--->8byte
		 */
		
		byte b1=25;
		short s1=b1;
		int i1=s1;
		long l1=-i1;            // why int to long has taken -25 sign
		float f1=l1;
		double d1=f1;
		System.out.println("Byte: "+b1);
		System.out.println("Byte to Short:"+s1);
		System.out.println("short to Integer:"+i1);
		System.out.println("Integer to Long:"+l1);
		System.out.println("Long to Float:"+f1);
		System.out.println("Float to Double:"+d1);
		
		
		/*here even we can change the data type from different class such conversion is called explicit casting
		 * we have to add a casting command in the bracket during this process
		 * like wise char can be converted into integer as per ascii table and vice versa
		 */
		int i2=109;
		char ch23=(char) i2;
		System.out.println("Integer:"+i2);
		System.out.println("Integer to character:"+ch23);
		
	}

}
