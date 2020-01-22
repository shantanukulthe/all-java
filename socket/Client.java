import java.io.*;
import java.net.*;
import java.util.*;
class Client
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("Client is Running");
		
		Socket s=new Socket("Localhost",2100);
	
		BufferedReader brk= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brs=new BufferedReader(new InputStreamReader(s.getInputStream()));	
		PrintStream ps=new PrintStream(s.getOutputStream());
	
		String Str1,Str2;
		
		while(true)
		{
			System.out.println("Enter the Message for Server");
			Str1=brk.readLine();
			if(Str1.equals("Exit"))
			{
				break;
			}
			ps.println(Str1);
			Str2=brs.readLine();
			System.out.println(" Message for Server "+"\n"+Str2);
		}
	}
}
					