//////// accept one no from user and remove its factorial

import java.io.*;
import java.util.*;

class factorial
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
	public void  check(int no)
	{
		if(no<0)
		{
			return ;
		}
		
		for(int i=1;i<no;i++)
		{
			if((no%i)==0)
			{
				System.out.println("factors are"+i);
			}
		}
	}
}