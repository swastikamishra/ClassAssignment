package OOPsconcepts;

interface MyInterface
{
	public void method1();
}
class Check implements MyInterface
{
	@Override
	public void method1()
	{
		System.out.println("Hello just checking in!");
	}
}
public class InterfaceDemo 
{
	public static void main (String []args)
	{
		Check obj = new Check ();
		obj.method1();
	}
	
			

}
