package five;
import java.io.*;
import java.util.*;

public class Live
{
	public static int FileChk(File f)
	{
		if(!f.exists())
		{
			System.out.println("file does not exists");
			return 0;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("file already exists");
		System.out.print("Do you want overwrite file? y/n: ");
		char a=sc.next().charAt(0);
		if(a=='y')
			return 0;
		return 1;
	}
	public static void main(String [] args)
	{
		String temp;
		Scanner sc=new Scanner(System.in);
		File f=new File("Sample5.txt");
		int t=FileChk(f);
		try(RandomAccessFile rf=new RandomAccessFile("Sample5.txt","rw"))
		{
			if(t==1)
				rf.seek(rf.length());
			else
			{
				rf.seek(0);
				while(rf.read()!=-1)
						rf.writeChars(null);	
				rf.seek(0);
			}
			System.out.println("Enter data: ");
			String t1=sc.next();
			byte []b=t1.getBytes();
			rf.write(b);
			rf.seek(0);
			byte []b1=new byte[((int)rf.length())];
			rf.read(b1);
			temp=new String(b1);
			System.out.println(temp);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
