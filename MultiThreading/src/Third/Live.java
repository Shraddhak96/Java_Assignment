package Third;

public class Live implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.print("Exec "+i+"\t");
		}
	}
	public static void main(String [] args)
	{
		Live l1=new Live();
		Thread t1=new Thread(l1);
		Thread t2=new Thread(l1);
		Thread t3=new Thread(l1);
		t1.start();
		t2.start();
		t3.start();
	}
}
