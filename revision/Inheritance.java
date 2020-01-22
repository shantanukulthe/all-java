import java.io.*;

class Base
{
	int i=0;
	int j=0;
	
	public void fun()
	{
			System.out.println("inside Base fun");
	}
	
	public void gun()
	{
		System.out.println("inside Base gun");
	}
}

class Dervide extends Base
{
	
	public void fun()
	{
			System.out.println("inside Dervide fun");
	}
	
	public void gun()
	{
		System.out.println("inside Dervide gun");
	}
	
	public void sun()
	{
		System.out.println("inside Dervide sun");
	}
}

class Inheritance
{
	public static void main(String arg[])
	{
			Base obj=new Base();
			obj.fun();
			System.out.println(obj.hashCode());
			Dervide dobj =new Dervide();
			dobj.gun();
			System.out.println(dobj.hashCode());
			Base bobj=new Dervide();
			
			bobj.fun();
			//bobj.sun();
			dobj.sun();
	}
}