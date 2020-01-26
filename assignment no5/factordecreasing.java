////////Write a program which accept number from user and display its factors in decreasing order

import java.io.*;
import java.util.*;

class factordecreasing
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int v=sobj.nextInt();
		
		Demo obj=new Demo();
		
		obj.check(v);
		
	
	}
}

class Demo
{
	public void check(int no)
	{
		
		if(no<0)
		{
			return ;
		}
		
		for(int i=(no/2);i>=1;i--)
		{
			if((no%i)==0)
			{
				System.out.println("Number in decreasing order are:"+i);
				
			}
			
		}
		
	}
}