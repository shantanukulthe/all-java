//////// accept one number from user if number is less than 10 then print hello else print demo


import java.io.*;
import java.util.*;

class printhelloordemo
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
		
		if(no<10)
		{		
			System.out.print("Hello"+"\t");
		}
		else
		{
			System.out.println("Demo"+"\t");
		}
	}
}