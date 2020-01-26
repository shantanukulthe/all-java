///////accept two no from user and display first no is second no of times

import java.io.*;
import java.util.*;

class largerno
{
	public static void main(String  arg[])
	{
			Scanner sobj=new Scanner(System.in);
			System.out.println("enter the number");
			
			int size= sobj.nextInt();
			 System.out.println("enter the second");
			 
			 int size2=sobj.nextInt();
			 System.out.println("enter the third");
			 int size3=sobj.nextInt();
			Demo  dobj=new Demo();
			
			dobj.check(size,size2,size3);
			
	}
}

class Demo
{
	public void check(int no1,int no2,int no3)
	{
		if((no1<0)&&(no2<0)&&(no3<0))
		{
			return ;
		}
		int j=0;
		
		if((no1<=no2)&&(no3<=no2))
		{
			System.out.println("larger no is"+no2);
		}
		else if ((no1<=no3)&&(no2<=no3))
		{
			System.out.println("larger no is"+no3);
		}
		else
		{
			System.out.println("larger no is"+no1);
		}
		
	}
}

















