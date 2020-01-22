import java.io.*;

interface Demo
{
	int i=10;
	int j=0;
	
	public void fun();
	public void gun();
	public void sun();	
	public void run();
}

interface Hello extends Demo
{
		public void hun();
}

class Base implements Hello
{
		public void fun()
		{
		
			System.out.println(i);
				System.out.println("inside Fun");
		}
		public void gun()
		{
				System.out.println("inside Fun");
		}
		public void sun()
		{
				System.out.println("inside Fun");
		}
		public void run()
		{
				System.out.println("inside Fun");
		}
		public void hun()
		{
		}
}

class Derived extends Base implements Hello
{
	
		public void fun()
		{
				System.out.println("inside Derived Fun");
		}
		public void gun()
		{
				System.out.println("inside Derived gun");
		}
		public void sun()
		{
				System.out.println("inside Derived sun");
		}
		public void run()
		{
				System.out.println("inside Derived run");
		}
		public void hun()
		{
				System.out.println("inside Derived hun");
		}
}

class Interface
{	
	public static void main(String arg[])
	{
			Base obj=new Base();
			
			obj.fun();
			
			Derived dobj=new Derived();
			dobj.hun();
			
			Base bobj=new Derived();
			
			
			bobj.sun();
			
	}
}