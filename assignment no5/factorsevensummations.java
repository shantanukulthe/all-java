/////////// accept no from user and returns its even factors summations


import java.io.*;
import java.util.*;

class factorsevensummations
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int v=sobj.nextInt();
		
		Demo obj=new Demo();
		
		int iret=obj.check(v);
		
		System.out.println("Summation is:"+iret);
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
			if((no%i)==0)
			{
				if((i%2)==0)
				{
					isum=isum*i;
				}
			}
			
		}
		return isum;
	}
}