/////////accpet  N no from   user and print its first 5 multiplication 

import java.io.*;
import java.util.*;

class first5multiplications
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
		int iret=obj.check(arr);
		System.out.println("multiplication of first 5 elements is:"+iret);
	}
}

class Demo
{
	public int  check(int arr[])
	{
		int isum=1;
		if(arr==null)
		{
			return 1;
		}
		
		for(int i=0;i<=4;i++)
		{
			
			isum=isum*arr[i];	
			
		}
				
	return isum;
	}
} 