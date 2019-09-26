package fourth;

import java.util.*;
import java.io.*;

public class Live {
	public static void main(String [] args)
	{
		List<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(101,"Sujit","CEO",910000000.0));
		a1.add(new Employee(102,"Raj","CTO",5000000.0));
		a1.add(new Employee(103,"Shradhha","CFO",20000000.0));
		a1.add(new Employee(104,"Nishi","HR",100000.0));
		
		try(FileOutputStream f=new FileOutputStream("Test_Emp.txt"))
		{
			try(ObjectOutputStream o=new ObjectOutputStream(f))
			{
				o.writeObject(a1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Write Operation Done!");
		
		try(FileInputStream f1=new FileInputStream("Test_Emp.txt"))
		{
			try(ObjectInputStream o1=new ObjectInputStream(f1))
			{
				List<Employee> ref=(List<Employee>) o1.readObject();
				Iterator i=ref.iterator();
				while(i.hasNext())
				{
					Employee temp=(Employee) i.next();
					temp.disp();
				}
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
