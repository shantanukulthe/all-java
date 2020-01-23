//Program to divide two numbers 
import java.io.*;
import java.util.*;

class divisionoftwo
{
	public static void main(String arg[])
	{
			Scanner sobj=new Scanner(System.in);
			System.out.println("enter two numbers");
			
			int value1=sobj.nextInt();
			int value2=sobj.nextInt();
			
			Demo dobj=new Demo();
			
			int iret =dobj.check(value1,value2);
			
			System.out.println("division of two no is:"+iret);
	}
}

class Demo
{
	public int check(int no1,int no2)
	{
			if((no1<0)&&(no2<0))
			{
				return 0;
			}
			
			int isum=0;
			
			isum=no1/no2;
	  return isum;
	}
}
	
