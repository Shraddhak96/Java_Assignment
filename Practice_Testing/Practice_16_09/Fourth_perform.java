package practice_16_09;

public class Fourth_perform implements Runnable 
{
	private Runnable ref;
	void Fourth_perform(Runnable ref)
	{
		this.ref=ref;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Test"+i);
			System.out.println(Thread.currentThread());
		}
	}
	public void perform()
	
	
}
