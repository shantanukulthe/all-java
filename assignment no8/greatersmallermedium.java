/////////// write program which accept no from user and if no is less than 50 then print small and if number is greater than 50 and small than 100 then print medium and if number is greater then 100 then print greater 

import java.io.*;
import java.util.*;

class greatersmallermedium
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
	public void  check(int no)
	{
		if(no<0)
		{
			return ;
		}
	
		if(no<50)
		{
			
			System.out.println("Number is smaller");
		}
		else if((no>50)&&(no<100))
		{
			System.out.println("Number is medium");
		}
		else
		{
			System.out.println("Number is greater");
		}
		
	}
} 