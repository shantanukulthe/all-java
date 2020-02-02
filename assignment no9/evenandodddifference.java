//////////////accept number from user and display difference between even and odd factors

import java.io.*;
import java.util.*;

class evenandodddifference
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the  first Number");
		int no1=sobj.nextInt();
		
		Demo obj=new Demo();
		int iret=obj.check(no1);
		System.out.println("difference is :"+iret);

	}
}

class Demo
{
	public int check(int no)
	{
		int sum=1;
		int sum2=1;
	
		if(no<0)
		{
			return 1;
		}
		
			for(int i=1;i<=no;i++)
			{
				if((i%2)!=0)
				{
					sum=sum*i;
				}
				else if((i%2)==0)
				{
					sum2=sum2*i;
				}
			}
			return sum-sum2;
	}
} 

 