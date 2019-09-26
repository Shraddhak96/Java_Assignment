package classLock;

public class Test implements Runnable
{
	public void run() 
	{
		disp();
	}
	public static void disp()
	{
		for(int i=0;i<=50;i++)
			System.out.print(" "+i);
	}
}
