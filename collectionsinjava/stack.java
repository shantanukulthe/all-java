import java.io.*;
import java.util.*;

class stack
{
		public static void main(String arg[])throws Exception
		{
				Stack<Integer>i=new Stack<Integer>();
				
				i.push(10);
				i.push(20);
				i.push(30);
				i.push(40);
				i.push(50);
				
				int j=i.pop();
				
				
				System.out.println("content are:"+i);
				System.out.println("content are:"+j);
		}
}