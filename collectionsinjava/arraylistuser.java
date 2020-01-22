import java.io.*;
import java.util.*;

class Employee
{
	int id;
	String name;
	int age;
	
	public Employee(int x,String y,int z)
	{
			this.id=x;
			this.name=y;
			this.age=z;
	}
	
}

class arraylistuser
{
		public static void main(String arg[])throws Exception
		{
				Employee e1=new Employee(11,"shantanu",25);
				Employee e2=new Employee(12,"shlok",20);
				Employee e3=new Employee(11,"sagar",35);
				
				
				ArrayList<Employee>k=new ArrayList<Employee>();
				
				k.add(e1);
				k.add(e2);
				k.add(e3);
				Iterator l=k.iterator();
				
				while(l.hasNext())
				{
					Employee et=(Employee)l.next();
				
				   System.out.println("content are:"+et.id+" "+et.name+" "+et.age);
				}
		}
}