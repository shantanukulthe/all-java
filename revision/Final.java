import java.io.*;

final class Base
{
		int i;
		final int k;
		int j;
		
		public Base()
		{
			System.out.println("inside construtor");
				this.i=10;
				this.k=10;
				this.j=30;
		}
		
		final public void gun()
		{
				
			System.out.println("inside gun");
		}
		
		public void sun()
		{
				int i=0;
			System.out.println("inside sun");
		}
		
}

class Derived extends Base
{
		public void gun()
		{
				System.out.println("inside Derived ");
				
		}
		public void sun()
		{
				System.out.println("inside Derived ");
		}
}

class Final
{
		public static void main(String arg[])
		{
			final Base hobj=new Base();
				
				hobj.gun();
				//hobj=new Derived();
				Derived dobj=new Derived();
				dobj.gun();
				
		}
}