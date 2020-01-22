import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		int arr[][]=new int[2][];
			
		arr[0]=new int[3];
		arr[1]=new int[4];
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enter the value");
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
		int isum=0;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				isum=isum+arr[i][j];	
				System.out.println("displayed arra is:"+arr[i][j]);
				
			}
			System.out.println("Addition is :"+isum);
		}
		
	}		
}	