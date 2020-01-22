import java.io.*;

class Mythread implements Runnable
{	
	public int arr[];
	public int i;
	public int result;
	
	public Mythread(int brr[],int x)
	{
			this.arr=brr;
			this.i=x;
			this.result=0;
	}
	
	public void run()
	{
			int icnt=0;
			
			for(int i=0;i<arr.length;i++)
			{
					if(((arr[i]%2)==0)&&(this.i==1))
					{
							System.out.println(arr[i]);
							icnt++;
					}
					else if(((arr[i
					]%2)!=0)&&(this.i==2))
					{
							System.out.println(arr[i]);
							icnt++;
					}
					
			}
			 this.result=icnt;
	}
}
class Multithreading
{
		public static void main(String arg[])throws Exception
		{
				int arr[]={10,20,21,13,24,35};
				
				
				Mythread obj1=new Mythread(arr,1);
				Thread t1=new Thread(obj1);
				
				Mythread obj2=new Mythread(arr,2);
				Thread t2=new Thread(obj2);

					t1.start();
					Thread.sleep(6000);
					t2.wait(1000);
					t2.start();
					
					System.out.println("sleep thread");
					Thread.sleep(6000);
					
					t2.join();
					t1.join();
					
					System.out.println("even no is"+obj1.result);
					System.out.println("odd no is"+obj2.result);
					
					
		}
}