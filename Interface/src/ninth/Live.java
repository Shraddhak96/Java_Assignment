package ninth;

public class Live {

	public static void perform(Game ref)
	{
		ref.play();
	}
	public static void main(String[] args) 
	{
		 perform(new Cricket());
		 perform(new Football());
		 perform(new Tennis());
	}
}