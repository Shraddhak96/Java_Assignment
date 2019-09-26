package fourth;

import java.io.*;

public class Live 
{
	public static void main(String [] args)
	{
		String temp=null;
		File f=new File("Sample.txt");
		try(FileReader fr=new FileReader(f))
		{
			try(BufferedReader br=new BufferedReader(fr))
			{
				char []b=new char[((int)f.length())];
				br.read(b);
				temp=new String(b);
				System.out.println(temp);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Read opn done!");
		File fs=new File("Sample_uni_copy.txt");
		try(FileWriter fw=new FileWriter(fs,true))
		{
			try(BufferedWriter bw=new BufferedWriter(fw))
			{
				bw.append(temp);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}