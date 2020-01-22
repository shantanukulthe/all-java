import java.io.*;


class Bufferinput
{
		public static void main(String arg[])throws Exception
		{
			InputStreamReader iobj=new InputStreamReader(System.in);
			BufferedReader bobj=new BufferedReader (iobj);
			
			System.out.println("enter string");
			
			String str=bobj.readLine();
			
			System.out.println(str);
		}
}