import java.io.*;
import java.net.*;
import java.util.*;
class Client1
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("Client is running");
	
		Socket s=new Socket("localhost",1);
	
		BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brs=new BufferedReader(new InputStreamReader(s.getInputStream()));		
		Scanner sobj=new Scanner (System.in);
		PrintStream ps=new PrintStream(s.getOutputStream());
		String Str1,Str2;		
		Integer ivalue1,ivalue2;	
		
		while(true)
		{	
			System.out.println("Enter the Message");
			ivalue1=sobj.nextInt();
			ivalue2=sobj.nextInt();
			Str1=brk.readLine();
			if(Str1.equals("Exit"))
			{
				break;
			}
			ps.println(ivalue1,ivalue2);
			Str2=brs.readLine();
			System.out.println("Addition is"+Str2);
		}
}
}
			
		
			
			
