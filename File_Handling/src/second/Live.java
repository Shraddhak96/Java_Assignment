package second;

import java.io.*;

public class Live {

	public static void main(String[] args)
	{
		Customer c1=new Customer(1001,"San","Mumbai",23);
		try(FileOutputStream f1=new FileOutputStream("Test_Sec.txt"))
		{
			try(ObjectOutputStream o1=new ObjectOutputStream(f1))
			{
				o1.writeObject(c1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Writing opn done!");
		try(FileInputStream f2=new FileInputStream("Test_Sec.txt"))
		{
			try(ObjectInputStream o2=new ObjectInputStream(f2))
			{
				System.out.println(o2.readObject());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
  