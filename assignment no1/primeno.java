import java.io.*;
import java.util.*;
class primeno
{
	public static void main(String arg[])
	{
			Scanner sobj=new Scanner (System.in);
			
			System.out.println("enter the Numbber");
			int value=sobj.nextInt();
			
			Demo obj=new Demo();
			
			boolean iret=obj.check(value);
			
			if(iret==true)
			{
					System.out.println("no is prime");
			}
			else
			{
				System.out.println("no is not a prime");
			}
			
	}
}

class Demo
{
	public boolean check(int no)
	{
		if((no%2)!=0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}