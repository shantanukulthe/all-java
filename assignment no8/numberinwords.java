////////accept number from user and print that number in word 1to 10

import java.io.*;
import java.util.*;

class numberinwords
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
	 switch (no)
	 {
		 case 1:
		  System.out.println("One");
		  break;
		  
		  case 2:
		  System.out.println("Two");
		  break;
		  
		  case 3:
		  System.out.println("Three");
		  break;
		  
		  case 4:
		  System.out.println("Four");
		  break;
		  
		  case 5:
		  System.out.println("Five");
		  break;
		  
		  case 6:
		  System.out.println("Six");
		  break;
		  
		  case 7:
		  System.out.println("Seven");
		  break;
		  
		  case 8:
		  System.out.println("Eight");
		  break;
		  
		  case 9:
		  System.out.println("Nine");
		  break;
		  
		  case 10:
		  System.out.println("ten");
		  break;
	}
} 
}