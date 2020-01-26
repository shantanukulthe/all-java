////////Write a program which accept number from user and return summation of all its non factors. 

import java.io.*;
import java.util.*;

class factorsoddsummation
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int v=sobj.nextInt();
		
		Demo obj=new Demo();
		
		int iret=obj.check(v);
		System.out.println("Summation of odd Factors is:"+iret);
	
	}
}

class Demo
{
	public int check(int no)
	{
		int isum=1;
		if(no<0)
		{
			return 1;
		}
		
		for(int i=1;i<no;i++)
		{
			if((no%i)!=0)
			{
				isum=isum+i;				
			}
			
		}
		return isum;
		
	}
} 