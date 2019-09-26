package practice_16_09;

public class Third implements Runnable 
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<10;i++)
			{
				System.out.print(" Test "+i);
				//System.out.print("\t"+i+"\t");
				//Thread.sleep(1);
				System.out.println(Thread.currentThread());
			}
		}
	}
	
	public static void main(String args[])
	{
		Third s1=new Third();
		Thread t1=new Thread(s1);
		//Thread t2=new Thread(s1);
		//t2.start();
		t1.setName("Sujit");
		t1.start();
		(new Thread(new Third())).start();
	}
}
