package first_a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class MyClass implements Serializable
	{
		private int num=10;
		
		@Override
		public String toString() {
			return "MyClass [num=" + num + "]";
		}

		public static void main(String args[]) 
		{
		 MyClass m1 = new MyClass();
		 MyClass m2 = new MyClass();
		 MyClass m3 = new MyClass();
		 MyClass m4 = new MyClass();
		 
		 List<MyClass>a1= new <MyClass>ArrayList();
		 a1.add(m1);
		 a1.add(m2);
		 a1.add(m3);
		 a1.add(m4);
		 
		 System.out.println(a1);
		
		 //writing the file
		 
		 try(FileOutputStream fis = new FileOutputStream("myfile.txt"))
		 {
			 try(ObjectOutputStream oos = new ObjectOutputStream(fis))
			 {
				 oos.writeObject(a1);
					
			 }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
		
		//reading the file
		 
		 try(FileInputStream fis = new FileInputStream("myfile.txt"))
		 {
			 try(ObjectInputStream oos = new ObjectInputStream(fis))
			 {
				 List<MyClass>a2= new <MyClass>ArrayList();
				 a2= (List<MyClass>) oos.readObject();
				 System.out.println(a2);
					
			 }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
		 
		 
		 
		}
	}
