package fourth;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int empId;
	private String empName;
	private String desig;
	private double basic;
	
	public Employee(int empId, String empName, String desig, double basic) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.desig = desig;
		this.basic = basic;
	}
	public void disp()
	{
	System.out.println("Employee [empId=" + empId + ", empName=" + empName + ", desig=" + desig + ", basic=" + basic + "]");
	}
}
