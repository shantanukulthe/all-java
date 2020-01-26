//////// accept two number from user and check whethear second no is factor of first no or not

import java.io.*;
import java.util.*;

class factors
{
	public static void main(String  arg[])
	{
			Scanner sobj=new Scanner(System.in);
			System.out.println("enter the number");
			
			int size= sobj.nextInt();
			
			System.out.println("enter the number");
			int  size2=sobj.nextInt();
			Demo  dobj=new Demo();
			
			boolean bret=dobj.check(size,size2);
			if(bret==true)
			{
				System.out.println("no is factor");
			}
			else
			{
				System.out.println("no is not a factor");
			}
	}
}

class Demo
{
	public boolean check(int no1,int no2)
	{
		if((no1<0)&&(no2<0))
		{
			return false;
		}
		
		if((no1%no2)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}