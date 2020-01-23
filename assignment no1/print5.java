//////Program to print 5 times Marvellous on screen 

import java.io.*;
import java.util.*;

class print5
{
	public static void main(String  arg[])
	{
			Scanner sobj=new Scanner(System.in);
			System.out.println("enter the number");
			
			int size= sobj.nextInt();
			
			Demo  dobj=new Demo();
			
			dobj.check(size);
			
	}
}

class Demo
{
	public void check(int no)
	{
		if(no<0)
		{
			return ;
		}
		
		for(int i=0;i<no;i++)
		{
			System.out.print("*"+"\t");
		}
	}
}