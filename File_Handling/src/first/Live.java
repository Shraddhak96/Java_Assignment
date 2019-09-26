package first;

import java.io.*;
import java.util.*;

public class Live {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream f = new FileOutputStream("Test.txt");
		DataOutputStream br=new DataOutputStream(f);
		System.out.println("Enter numbers, press 0 for escape: ");
		int b=10;
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			String in=sc.nextLine();
			b=Integer.parseInt(in);
			//System.out.println(in);
			if(b==0)
				break;
			br.writeInt(b);
		}
		f.close();
		System.out.println("Done!");
		FileInputStream f1=new FileInputStream("Test.txt");
		DataInputStream bi=new DataInputStream(f1);
		while(bi.available()!=0)
			System.out.println(bi.readInt());
		bi.close();
		f1.close();
	}

}
