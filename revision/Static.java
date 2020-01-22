import java.io.*;

class Base
{
		int i;
		static int k;
		static int j;
		
		
		/*static
		{
				System.out.println("inside static block");
				
				k=10;
				j=20;
				
		}*/
		
		public Base()
		{
			System.out.println("inside constructor");
				this.k=20;
				this.j=10;
				this.i=5;
		}
		public void fun()
		{
				System.out.println("inside fun");
				System.out.println(this.k);
				System.out.println(this.i);
				System.out.println(this.j);
		}
		static public void gun()
		{
			System.out.println("inside gun");
			System.out.println(k);
			System.out.println(j);
			//System.out.println(i);
		}
}
class Derived extends Base 
{
		public Derived()
		{
				super();
		}
		/*public void gun()
		{
			
				System.out.println("inside Derived gunn");
		}*/
}

class Static
{
	
		public static void main(String arg[])
		{	
			Base hobj=new Base();
			System.out.println(Base.j);
			System.out.println(Base.k);
			hobj.fun();
			//hobj.gun();
			Base bobj=new Derived();
			//bobj.gun();
			Base.gun();
		}
	
}
				