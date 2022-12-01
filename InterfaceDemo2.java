package OOPsconcepts;

interface MyInterface2
{
	public void method1();
	int x =23;
	
	static int cube (int x)
	{
		return x*x*x;
	}
	private void add (int a,int b) //Private methods can only be accessed in this interface class
	{                              //and it cannot be inherited or implemented by any other class
		System.out.println("add: "+(a+b));
	}
	private static void sub (int a, int b)
	{
		System.out.println("sub: "+(a-b));
	}
	default void fun ()
	{
		System.out.println("We can add method body in interface using default!"); //default can be used to provide body to method
		add(10,20);                                                               // in interface
		sub(20,30);
	}
}
class Tests
{
	int id;
	Tests (int id)
	{
		this.id=id;
	}
	void display ()
	{
		System.out.println(id);
	}
}
interface NewInterface
{
	static String draw()
	{
		return "Draw Something!";
	}
}
class Damnn extends Tests implements MyInterface2,NewInterface
{
	Damnn(int id)
	{
		super(id);
		
	}
	
	
	@Override
	public void method1()
	{
		System.out.println("Overriden method of interface");
	}
}
public class InterfaceDemo2 {
	public static void main (String []args)
	{
		Damnn obj = new Damnn(30);
		obj.method1();
		obj.display();
		obj.fun();
		System.out.println(MyInterface2.cube(5));
		System.out.println(NewInterface.draw());
	}

}
