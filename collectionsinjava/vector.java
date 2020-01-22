import java.io.*;
import java.util.*;

class vector
{	
	public static void main(String arg[])throws Exception
	{
			Vector <Integer> i=new Vector<Integer>(50,10);
			
			i.add(10);
			i.add(20);
			i.add(30);
			i.add(40);
			i.add(50);
			i.add(60);
			i.add(70);
			i.add(80);
			i.add(90);
			i.add(100);
			i.add(110);
			
			i.add(5,121);
			i.remove(5);
			i.set(5,101);
			
			System.out.println("content are:"+i);
			System.out.println("content are:"+i.size());
			Iterator z=i.iterator();
			
			while(z.hasNext())
			{
					System.out.println(z.next());
			}
	}
}