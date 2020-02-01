//////// accept  two no from user and check whether that no is equal or not

import java.io.*;
import java.util.*;

class equalornot
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the  first Number");
		int no1=sobj.nextInt();
		
		System.out.println("Enter the  second Number");
		int no2=sobj.nextInt();;
				
		Demo obj=new Demo();
		obj.check(no1,no2);
		
	
	}
}

class Demo
{
	public void check(int no1,int no2)
	{
		if((no1<0)&&(no2<0))
		{
			return ;
		}
		if(no1!=no2)
		{
			System.out.println("Number is not equal");
		}
		else 
		{
			System.out.println("Number is equal");
		}
	}
} 