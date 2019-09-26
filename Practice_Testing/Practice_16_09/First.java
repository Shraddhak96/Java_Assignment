package practice_16_09;
import java.io.*;
/*public class First
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr=new FileReader("D:\\SujitX_Tej\\DAC_DBDA_Aug_19_JavaSE\\Day_3\\Exception_Handling\\What is Exception1.txt");
		BufferedReader br=new BufferedReader(fr);
		
		System.out.println(br.readLine());
	}
}
*/
import java.io.*;
public class First implements Serializable
{
	String name="sachin";
	int age=20;
	transient Thread t=new Thread();
	public static void main(String args[])
	{
			First s =new First();
			try(FileOutputStream fos=new FileOutputStream("D:\\SujitX_Tej\\DAC_DBDA_Aug_19_JavaSE\\Day_5\\With_Serializable\\ab1.txt"))
			{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
			oos.writeObject(s); //Serialization
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
System.out.println(s.name+"\t"+s.age+"\t"+s.t);
			s=null;

			try(FileInputStream fis=new FileInputStream("D:\\SujitX_Tej\\DAC_DBDA_Aug_19_JavaSE\\Day_5\\With_Serializable\\ab1.txt"))
			{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
			First s1=(First)ois.readObject();
// Deserialization
			System.out.println(s1.name +"\t"+s1.age+"\t"+s1.t);
			}
			}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
}
}			