import java.io.*;
import java.util.*;

class arraylist
{
	public static void main(String arg[])throws Exception
	{
			ArrayList <String> i=new ArrayList <String> ();
			
			
			i.add("shantanu");
			i.add("shlipi");
			i.add("sagar");
			i.add("karauna");
			
			i.add(3,"gopal");
			
			i.set(2,"xxx");
			i.remove(2);
			System.out.println("content are"+i);
		System.out.println("last ocuurance is :"+i.indexOf("karuna"));
		
		
		Iterator k=i.iterator();
		
		while(k.hasNext())
		{
				System.out.println(k.next());
		}
		
		
	}
}