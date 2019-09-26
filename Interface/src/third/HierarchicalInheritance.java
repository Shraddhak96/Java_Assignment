package third;

public class HierarchicalInheritance
{
	public static void main(String [] args)
	{
		Cat c = new Cat();
		c.eat();
		c.meow();
		/* c.bark(); //error
		  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		 
		The method bark() is undefined for the type Cat

		at third.HierarchicalInheritance.main(HierarchicalInheritance.java:10) */
		
	}
}