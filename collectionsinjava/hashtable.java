import java.io.*;
import java.util.*;

class hashtable
{
	public static void main(String arg[])throws Exception
	{
				Hashtable<String,Integer>i=new Hashtable<String,Integer>();
			
			i.put("shantanu",1);
			i.put("shlok",2);
			i.put("simran",3);
			i.put("sagar",4);
			i.put("karuna",5);
			
			if(i.containsKey("shantanu"))
			{
				System.out.println("the key is already there");
			}
			else
			{
				System.out.println("new key inserted");
			}
			
			
			if(i.containsKey(1))
			{
				System.out.println("the key is already there");
			}
			else
			{
				System.out.println("new key inserted");
			}
	
			
			System.out.println("content are:"+i);
			
			Enumeration k=i.keys();
			
			while(k.hasMoreElements())
			{
				System.out.println(k.nextElement());
			}
			
			
	}
}