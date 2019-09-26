package first;

import java.io.Serializable;

public class MyNum implements Serializable
{
	private int num;

	public MyNum(int num) {
		this.num = num;
		
	}

	@Override
	public String toString()
	{
		return "MyNum [num=" + num + "]";
	}
	
}
	

