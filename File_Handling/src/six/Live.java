package six;

import java.io.*;
public class Live 
{
	public static void main(String[] args)
	{		
		Nano n1=new Nano("Nano","Lxi","Matt Black", 100000.0);
		try(FileOutputStream f1=new FileOutputStream("Car_Sample.txt"))
		{
			try(ObjectOutputStream o1=new ObjectOutputStream(f1))
			{
				o1.writeObject(n1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Writing done!");
		System.out.println(n1);
		System.out.println(n1.carName);
		
		try(FileInputStream f2=new FileInputStream("Car_Sample.txt"))
		{
			try(ObjectInputStream o2=new ObjectInputStream(f2))
			{
				Nano e1=(Nano) o2.readObject();
				System.out.println(e1);
			}
		}
		catch(Exception er)
		{
			er.printStackTrace();
		}	
	}
}