////////// 5. Write a program which accept total marks & obtained marks from user and calculate percentage


//////// accept 3 no from user and print its multiplication


import java.io.*;
import java.util.*;

class percentage
{
	public static void main(String arg[])throws Exception
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the  first Number");
		int no1=sobj.nextInt();
		
		System.out.println("Enter the  second Number");
		int no2=sobj.nextInt();
		
				
		Demo obj=new Demo();
		float iret=obj.check(no1,no2);
		System.out.println("percentage is:"+iret);
	
	}
}

class Demo
{
	public float check(int no1,int no2)
	{
		if((no1<0)&&(no2<0))
		{
			return 1;
		}
		float result=(grrfve(no1/no2)*100);
		
		return result;
	}
} 