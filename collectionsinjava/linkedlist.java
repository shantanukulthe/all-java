import java.io.*;
import java.util.*;


class linkedlist
{
		public static void main(String arg[])throws Exception
		{
				LinkedList <Integer> i=new LinkedList<Integer>();
				
				i.add(11);
				i.add(21);
				i.add(51);
				
				i.addFirst(10);
				i.add(3,22);
				i.addLast(101);
				
				i.removeFirst();
				i.removeLast();
				i.remove(3);
				
				System.out.println("content are:"+i);
				System.out.println("content are:"+i.size());
				
				Iterator k=i.iterator();
				
				while(k.hasNext())
				{
						System.out.println(k.next());
				}
		}
}