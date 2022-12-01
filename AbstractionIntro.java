package OOPsconcepts;
abstract class AbstractDemo
{
	void fun ()
	{
		System.out.println("Heyy Everyone!");
	}
	abstract void display ();
}

class Throw extends AbstractDemo
{
	@Override
	void display()
	{
		System.out.println("Trying first");
	}
}
public class AbstractionIntro {
public static void main (String []args)
{
	AbstractDemo demo;
	demo = new Throw();
	demo.fun();
	demo.display();
	
}
}
