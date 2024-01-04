package array;

public class array2d_demo {

	public static void main(String[] args) 
	{
		
		int arr[][]=new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println("Total rows are : "+arr.length);
		System.out.println("Total columns are : "+arr[0].length);
		
		System.out.println("------iteration using for loop------");
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("----iteration using for each loop-----");
		
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("*****************************");
		
		// Literal way
		
		int sid[][]= {{10,20},{30,40},{50,60}};
		System.out.println("total number of Row: "+sid.length);
		System.out.println("Total number of Column: "+sid[0].length);
		
		for(int i[]:sid)
		{
			for(int j:i)
			{
				System.out.print(j+" ");				
			}
			System.out.println();
		}
		
		
		System.out.println("****************");
		
		String loc[][]= {{"pune","vimannagar"},{"mumbai","sanpada"},{"Nagpur","Location"}};
		for (String i[]:loc)
		{
			for(String j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		
	}

}
