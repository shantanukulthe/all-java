import java.io.*;
import java.util.*;

class evenandodd
{
		public static void main(String arg[])throws Exception
		{
				Scanner sobj=new Scanner(System.in);
				
				System.out.println("enter the array");
				
				int values=sobj.nextInt();
				
				int arr[]=new int[values];
				
					System.out.println("enter the element of array");
				for(int i=0;i<values;i++)
				{
					
					arr[i]=sobj.nextInt();
				}
				
				Demo obj=new Demo();
				obj.check(arr);
		}
}

class Demo
{
	public void check(int arr[])
	{
		
			for(int i=0;i<arr.length;i++)
			{
				
				if((arr[i]%2)==0)
				{
					System.out.println("even number is"+arr[i]+"\t");
				}
				else
				{
					System.out.println("odd number is"+arr[i]+"\t");
				}
			}
	}
}
				