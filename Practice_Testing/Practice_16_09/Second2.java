package practice_16_09;

import java.io.*;

public class Second2 
{
	public static void main(String [] args) throws IOException
	{
		OutputStream f = new FileOutputStream("Test.txt");
		BufferedOutputStream br=new BufferedOutputStream(f);
		String s="Welcome, Game is ON!";
		byte [] b=s.getBytes();
		br.flush();
		br.write(b);
		br.close();
		f.close();
		System.out.println("Done!");
		FileInputStream f1=new FileInputStream("Test.txt");
		BufferedInputStream bi=new BufferedInputStream(f1);
		int i;
		while((i=bi.read())!=-1)
		{
			System.out.print((char)i);
		}
		bi.close();
		f1.close();
	}
}
