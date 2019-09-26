package third;

public class Generic<T extends Game> 
	{
	private T ref;

	public Generic(T ref) {
		
		this.ref = ref;
	
	}
     public void perform()
     {
    	 ref.play();
     }
	 public static void main(String args[])
	 {
		 Generic<Football> f= new Generic<Football>(new Football());
		 f.perform();
		 Generic<Baseball> b= new Generic<Baseball>(new Baseball());
		 b.perform();
		 Generic<Cricket> c= new Generic<Cricket>(new Cricket());
		 c.perform();
	  }
	}
