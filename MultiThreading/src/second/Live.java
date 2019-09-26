package second;

public class Live implements Runnable 
{
	public void run()
	{
		synchronized(this)
		{
			for(char i='a';i<='z';i++)
			{
				System.out.print(" "+i);
			}
		}
	}
	public static void main(String[] args)
	{
		Live l1=new Live();
		Live l2=new Live();
		Thread t1=new Thread(l1);
		Thread t2=new Thread(l2);
		t1.start();
		t2.start();
	}
}
