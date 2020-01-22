import java.io.*;

abstract class Base
{
		int i=0;
		int j=0;
		public Base(int x,int y)
		{
				this.i=x;
				this.j=y;
				System.out.println("inside constructor");
		}
		
		
		abstract public void fun();
		 public void gun()
		 {
				System.out.println("inside base gun");
		 }
		abstract public void sun();
}

class  Derived extends Base
{
	public Derived()
	{
			super(10,20);
			
	}
		public void fun()
		{
				System.out.println("inside Derived fun");
		}
		/*public void gun()
		{
				System.out.println("inside Derived gun");
		}*/
		public void sun()
		{
				System.out.println("inside Derived sun");
		}
}


class Abstract
{
		public static void main(String arg[])
		{	
			Base bobj = new Derived();
			bobj.gun();
			bobj.fun();
			
		}
}