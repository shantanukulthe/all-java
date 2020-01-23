////////Accept one number and check whether is is divisible by 5 or not. 

import java.io.*;
import java.util.*;

class Divisibleby5
{
	public static void main(String  arg[])
	{
			Scanner sobj=new Scanner(System.in);
			System.out.println("enter the number");
			
			int size= sobj.nextInt();
			
			Demo  dobj=new Demo();
			
			boolean bret=dobj.check(size);
			
			if(bret==true)
			{
				System.out.println("no is divisible by 5");
			}
			else
			{
				System.out.println("no is not divisible by 5");
			}
			
	}
}

class Demo
{
	public boolean check(int no)
	{
		if(no<0)
		{
			return false ;
		}
		
		
		if((no%5)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}