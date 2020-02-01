////////Write a program which accept name from user and print that name.  

import java.io.*;
import java.util.*;

class namestring
{
	public static void main(String arg[])throws Exception
	{
		
		
		System.out.println("Enter the string");
		
		
		InputStreamReader io=new InputStreamReader (System.in);
		BufferedReader s=new BufferedReader(io);
	    Demo obj=new Demo();
		String a=s.readLine();
		obj.check(a);
		
	
	}
}

class Demo
{
	public void check(String str)
	{
		System.out.println("String is:"+str);
		
	}
} 