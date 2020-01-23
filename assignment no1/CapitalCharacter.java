import java.io.*;
import java.util.*;

class CapitalCharacter
{
	public static void main(String arg[])throws Exception
	{
			System.out.println("enter the string");
			InputStreamReader sobj=new InputStreamReader(System.in);
			
			BufferedReader sb=new BufferedReader(sobj);
			
			String str=sb.readLine();
			
			
			Demo dobj=new Demo();
			
			dobj.capitalletter(str);
			
	}
}

class Demo
{
		public void capitalletter(String str)
		{
				char arr[]=str.toCharArray();
				int icnt=0;
				for(int i=0;i<arr.length;i++)
				{
						if((arr[i]>='A')&&(arr[i]<='Z'))
						{
							icnt++;
						}
				}
				System.out.println(icnt);
		}
}