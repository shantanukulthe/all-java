import java.io.*;
import java.net.*;
class Server
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("Server is Running");
	
		ServerSocket ss=new ServerSocket(2100);
		Socket s=ss.accept();
	
		BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brs=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream ps=new PrintStream(s.getOutputStream());
	
		String Str1,Str2;
		
		while(true)	
		{
			Str1=brs.readLine();
			if(Str1==null)
			{
				break;
			}
			System.out.println("Message from Client "+"\n"+Str1);
			System.out.println("Enter the Message for Client");
			Str2=brk.readLine();
			ps.println(Str2);
		}
	}
}