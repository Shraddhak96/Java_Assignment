package eight;

public class Sub1 extends base1{
	
	private int b;
	
	public Sub1(int a)
	{
		super(a);
	}
	
	public Sub1(int a, int b) {
		super(a);
		this.b = b;
	}

	public Sub1() 
	{
		super(10);
	}
	void disp()
	{
		System.out.println(a+" "+b);
	}
}
