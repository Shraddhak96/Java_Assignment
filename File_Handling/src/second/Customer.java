package second;

import java.io.Serializable;

public class Customer implements Serializable
{
	private int custId;
	private String custName;
	private String address;
	private int age;
	
	public Customer(int custId,String custName, String address, int age)
	{
		this.custId=custId;
		this.custName=custName;
		this.address=address;
		this.age=age;
	}
}
