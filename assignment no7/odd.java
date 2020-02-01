/////////accpet no from user and prints  all its  odd number 

import java.io.*;
import java.util.*;

class odd
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		
		System.out.println("enter the size");
		int size=sobj.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the  elements");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		Demo obj=new Demo();
		obj.check(arr);

	}
}

class Demo
{
	public void  check(int arr[])
	{
		if(arr==null)
		{
			return ;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if((i%arr[i])!=0)
			{
				System.out.print(arr[i]+"\t");
				
			}
		}
				
	
	}
} 