package fourth;

public class Test implements Runnable
{
	public void run() 
	{
		disp();
	}
	synchronized public static void disp()
	{
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
}
