/////////// write program which accept no from user and display its table in reverse order

import java.io.*;
import java.util.*;

class reversetable
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the  first Number");
		int no1=sobj.nextInt();
		
		System.out.println("Factor till");
		int no2=sobj.nextInt();
		
		Demo obj=new Demo();
		obj.check(no1,no2);
		
	}
}

class Demo
{
	public void check(int no1,int till)
	{
		int sum=1;
		if(no1<0)
		{
			return ;
		}
	    System.out.println("table is ");
		for(int i=till;i>=1;i--)
		{
			sum=no1*i;
			System.out.println(sum);
		}
	
	}
} 


