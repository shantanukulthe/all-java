///////Write a program which accept number from user and display all its non factors.

import java.io.*;
import java.util.*;

class nonfactor
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
		
		for(int i=1;i<no;i++)
		{
			if((no%i)!=0)
			{
				System.out.println(i);
				
			}
			
		}
		
	}
} 