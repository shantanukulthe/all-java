/////accept no from user and print $ using while

import java.io.*;
import java.util.*;

class print$
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
		
			int i=1;
			while(i<=no)
		{
			System.out.print("$"+"\t");
			i++;
		}
	}
}