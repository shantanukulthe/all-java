import java.io.*;

class Base
{
		public void fun()
		{
				
		}
		public void gun()
		{
		}
}
class Derived extends Base
{
		public void sun()
		{
		}
}

class Instanceof
{
		public static void main(String arg[])
		{
				Base bobj=new Base();
				
				Derived dobj=new Derived();
				
				System.out.println(dobj instanceof Derived);
		}
}