//////// accept 3 no from user and print its multiplication

//////// accept  two no from user and check whether that no is equal or not

import java.io.*;
import java.util.*;

class multiplicationof3no
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the  first Number");
		int no1=sobj.nextInt();
		
		System.out.println("Enter the  second Number");
		int no2=sobj.nextInt();
		
		System.out.println("Enter the  third Number");
		int no3=sobj.nextInt();
				
		Demo obj=new Demo();
		int iret=obj.check(no1,no2,no3);
		System.out.println("Multiplication of 3 no is:"+iret);
	
	}
}

class Demo
{
	public int check(int no1,int no2,int no3)
	{
		if((no1<0)&&(no2<0)&&(no3<0))
		{
			return 1;
		}
		int result=no1*no2*no3;
		
		return result;
	}
} 