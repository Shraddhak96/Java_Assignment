package fifth;

public class Live {

	public static void main(String[] args)
	{
		Shape a[]=new Shape[3];
		a[0]=new Triangle();
		a[1]=new Polygon();
		a[2]=new Circle();
		
		for(int i=0;i<a.length;i++)
		{
			a[i].draw();
		}
	}

}
