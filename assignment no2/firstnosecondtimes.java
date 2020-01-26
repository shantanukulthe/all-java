///////accept two no from user and display first no is second no of times

import java.io.*;
import java.util.*;

class firstnosecondtimes
{
	public static void main(String  arg[])
	{
			Scanner sobj=new Scanner(System.in);
			System.out.println("enter the number");
			
			int size= sobj.nextInt();
			 System.out.println("enter the second");
			 
			 int size2=sobj.nextInt();

			Demo  dobj=new Demo();
			
			dobj.check(size,size2);
			
	}
}

class Demo
{
	public void check(int no,int size)
	{
		if(no<0)
		{
			return ;
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(no+"\t");
		}
	}
}