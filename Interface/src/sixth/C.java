package sixth;

interface A
{
	void disp();
}
interface B extends A
{
	void disp2();
}

class C implements B
{
	public void disp2()
	{
		System.out.println("Disp2");
	}
	public void disp()
	{
		System.out.println("Disp1");
	}
}
