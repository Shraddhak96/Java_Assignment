import java.util.*;
public class StringSort
{
	public static void main(String [] args)
	{
		int a[],n,no,i,j,temp;
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		String b=sc.next();
		no=Integer.parseInt(b);
		a=new int[no];
		for(i=0;i<no;i++)
		{
			System.out.print("Enter no:");
			Scanner c=new Scanner(System.in);
			String q=c.next();
			n=Integer.parseInt(q);
			a[i]=n;
		}
		System.out.println();
		for(i=0;i<no-1;i++)
		{
			for(j=0;j<no-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(i=0;i<no;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println(a[1]);
		a=null;
		System.gc();
		System.out.println(a[1]);
	}
} 	