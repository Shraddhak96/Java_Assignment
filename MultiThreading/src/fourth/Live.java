package fourth;



public class Live extends Thread{

	public static void main(String[] args) 
	{
		Test l1=new Test();
		Test l2=new Test();
		Thread t1=new Thread(l1);
		Thread t2=new Thread(l2);
		t1.start();
		t2.start();
	}

}