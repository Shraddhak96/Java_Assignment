package first;

public class San extends Thread
{
	public void run()
	{
		for(char i='A';i<='Z';i++)
		{
			System.out.print(" "+i);
		}
	}
	public static void main(String[] args)
	{
		San t1=new San();
		San t2=new San();
		t1.start();
		t2.start();
		
	}
}
