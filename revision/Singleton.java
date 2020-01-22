import java.io.*;

class Demo
{
		public Demo()
		{
				System.out.println("inside constructor");
		}
		
		private static  Demo hobj=null;
		
			
		private static Demo GetObject()
		{
				if(hobj==null)
				{
					System.out.println("inside getobject");
					hobj=new Demo();
				}
					return hobj;
		}  	
}

class Singleton
{
		public static void main(String arg[])
		{
				Demo hobj=new Demo();
				hobj=Demo.GetObject();
				Demo hobj1=new Demo();
				hobj1=Demo.GetObject();
		}
}