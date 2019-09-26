package second;
 import java.util.*;
import java.util.Map.Entry;
public class Demo {

	public static void main(String[] args)
	
	{
		Map <Integer, String> m1= new HashMap<Integer, String>();
		m1.put(1, "a");
		m1.put(2, "b");
		m1.put(3, "c");
		m1.put(4, "d");
		m1.put(5, "e");
		m1.put(6, "f");
		m1.put(7, "g");
		m1.put(8, "h");
		m1.put(9, "i");
		m1.put(10, "j");
		
		
		Set <Entry<Integer,String>> set= m1.entrySet();
		Iterator <Entry<Integer,String>> i=set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<Integer, String> me= (Entry<Integer, String>)i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}

	}

}
