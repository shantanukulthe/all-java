import java.io.*;

class Hello
{
		int i;
		static int j;
		
		{
			System.out.println("inside unnamed block");
			i=10;
			j=20;
		}
		
		static 
		{
				j=10;
				System.out.println("inside static block");
		}
		
}
class UnnamedBlock
{
		public static void main(String arg[])
		{
				Hello hobj1=new Hello();
				Hello hobj2=new Hello();
				
				System.gc();
		}
}