////Write a program which accept one number from user and check whether that number is greater than 100 or not
  

import java.io.*;
import java.util.*;

class greaterornot
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int no=0;
		
		no=sobj.nextInt();
		
		Demo obj=new Demo();
		obj.check(no);
		
	
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
		if(no<100)
		{
			System.out.println("Number is Smaller than 100");
		}
		else 
		{
			System.out.println("Number is greater than 100");
		}
	}
} 