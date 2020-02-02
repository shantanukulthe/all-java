//////////////accept us currency from user and convert it into indian currency

import java.io.*;
import java.util.*;

class currencyconverter
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the  first Number");
		int no1=sobj.nextInt();
		
		Demo obj=new Demo();
		obj.check(no1);
		

	}
}

class Demo
{
	public void check(int no)
	{
		int sum=1;
		
		sum=no*70;
		
		System.out.println("In Indian currency is:"+sum);
	}
} 

 