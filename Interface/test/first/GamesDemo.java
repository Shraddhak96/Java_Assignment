package first;

public class GamesDemo {
	public static void Perform(Game ref)
	{
		ref.play();
	}
	public static void main(String[] args) 
	{
		Game in[]= {new Cricket(),new Football(),new Tennis()};
		for(int i=0;i<in.length;i++)
				Perform(in[i]);
	}

}