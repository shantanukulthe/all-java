/////////// accept no from user and print that number $ and * on screen

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
	public void  check(int no)
	{
		if(no<0)
		{
			return ;
		}
		
		for(int i=1;i<=no;i++)
		{
			if((i%2)==0)
			{
				System.out.print("*"+"\t");
			}
			else
			{
				System.out.print("$"+"\t");
			}
		}
				
	
	}
} 