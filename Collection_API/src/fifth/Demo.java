package fifth;

import java.util.*;
import java.util.Map.Entry;

public class Demo {
	
	public static void main(String[] args) {

		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("1", "Sachin");
		m1.put("2", "Virat");
		m1.put("3", "Bumrah");
		m1.put("4", "Yuvraj");
		m1.put("5", "Rohit");
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		String q = sc.next();
		System.out.print(m1.get(q));

	}
}
