package OOPsconcepts;

class Eat
{
	public void Help ()
	{
		System.out.println("Im class A");
	}
}

class Sleep extends Eat
{
	@Override
	public void Help ()
	{
		super.Help();	//System.out.println("Im class A");
	System.out.println("Im class B");
	}
}
interface Beat 
{
	public void method ();

}
class Drink extends Sleep implements Beat
{
	public void method ()
	{
		System.out.println("This is class D and is interfaced from C");
	}
}

public class HybridInheritanceDemo1 {
	public static void main (String []args)
	{
		Drink obj = new Drink();
		obj.Help();
		obj.method();
	}

}
