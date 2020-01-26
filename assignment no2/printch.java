/////accept no from user and character from user 

import java.io.*;
import java.util.*;

class printch
{
	public static void main(String  arg[])
	{
			Scanner sobj=new Scanner(System.in);
			System.out.println("enter the number");
			
			int size= sobj.nextInt();
			
			System.out.println("enter the character");
			char ch=sobj.next().charAt(0);
			Demo  dobj=new Demo();
			
			dobj.check(size,ch);
			
	}
}

class Demo
{
	public void check(int no,char ch)
	{
		if(no<0)
		{
			return ;
		}
		
			int i=1;
			while(i<=no)
		{
			System.out.print(ch+"\t");
			i++;
		}
	}
}