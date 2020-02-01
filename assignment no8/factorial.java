/////////// write program which accept no from user and display its factors

import java.io.*;
import java.util.*;

class factorial
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the  first Number");
		int no1=sobj.nextInt();
		
		Demo obj=new Demo();
		int iret=obj.check(no1);
		
		System.out.println("factors are:"+iret);

	}
}

class Demo
{
	public int  check(int no)
	{
		int sum=1;
		if(no<0)
		{
			return 1;
		}
	
		for(int i=1;i<=no;i++)
		{
			sum=sum*i;
			
		}
		return sum;
	}
} 

