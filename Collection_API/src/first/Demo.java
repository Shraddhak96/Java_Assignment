package first;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) 
	{
		List<MyNum> a1=new ArrayList<MyNum>();
		a1.add(new MyNum(100));
		a1.add(new MyNum(200));
		a1.add(new MyNum(300));
		a1.add(new MyNum(400));
		

		
		try(FileOutputStream f = new FileOutputStream("test.txt"))
		{
			try(ObjectOutputStream o = new ObjectOutputStream(f))
			{
				
					o.writeObject(a1);
				
			}
			f.close();
		}
		catch (Exception e) 
		{
				e.printStackTrace();
		}
		
		try(FileInputStream f1 = new FileInputStream("test.txt"))
		{
			try(ObjectInputStream o1 = new ObjectInputStream(f1))
			{
				
				List<MyNum>ref2= new ArrayList<MyNum>();
				ref2=(List<MyNum>)o1.readObject();
				System.out.println(ref2);
	
			}
		
		}
		catch (Exception e) 
		{
				e.printStackTrace();
		}		
	}
		
}
