package third;

import java.io.*;

public class Live {
	
	public static void main(String [] args)
	{
		File f=new File("Sample.txt");
		String h = null;
		try(FileInputStream f1= new FileInputStream(f))
		{
			byte []b=new byte[((int)f.length())];
			f1.read(b);
			h=new String(b);
			System.out.println(h);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		File w=new File("Sample_copy.txt");
		try(FileOutputStream f2=new FileOutputStream(w))
		{
			byte []b=h.getBytes();
			f2.write(b);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
