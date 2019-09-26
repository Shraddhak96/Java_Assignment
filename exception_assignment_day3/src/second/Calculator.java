package second;

import java.util.Scanner;

public class Calculator 
{
	private int a,b,g;
	public void function() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		this.b=sc.nextInt();
		try 
		{
			g=calDouble(b);
			System.out.println(g);
		} 
		catch (MyArithException e)
		{
				System.out.println(e);
		}
	}
	public int calDouble(int a) throws MyArithException 
	{
		if(a>0)
		{
			this.a = a;
			
		}
		else if(a==0)
		{
			throw new MyArithException("Zero not allowed");
		} 
		else
		{
			throw new MyArithException("negative not allowed");
		}
		return (a*2);
	}
}
