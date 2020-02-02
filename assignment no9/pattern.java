/////////// write program which accept no from user and display ***** #####

import java.io.*;
import java.util.*;

class pattern
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the  first Number");
		int no1=sobj.nextInt();
		
		Demo obj=new Demo();
		obj.check(no1);
		

	}
}

class Demo
{
	public void check(int no)
	{
		int sum=1;
		if(no<0)
		{
			return ;
		}
	
		for(int i=1;i<=no;i++)
		{
			System.out.print("*"+"\t");
			
		}
		
		for(int i=1;i<=no;i++)
		{
			System.out.print("#"+"\t");
			
		}
		
		
		
	}
} 

