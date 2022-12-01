package OOPsconcepts;

class HappyA 
{
	public void New ()
	{
		System.out.println("This is class A");
	}
}

interface HappyD
{
	public void Want ();
}

class HappyB extends HappyA implements HappyD
{
	@Override
   public void New()
	{
        super.New();
        System.out.println("This is class HappyB inherited from class HappyA");
	}
   
   public void Want()
   {
	   System.out.println("This is class HappyB implemnted from interface HappyD");
   }
 }

class HappyC extends HappyA implements HappyD
{
	@Override
	public void New()
	{
        super.New();
        System.out.println("This is class HappyC inherited from class HappyA");
	}
   
   public void Want()
   {
	   System.out.println("This is class HappyC implemnted from interface HappyD");
   }
	
}

public class HybridInheritanceDemo2 {
	public static void main (String args [])
	{
		HappyB obj = new HappyB();
		obj.New();
		obj.Want();
		
		HappyC obj2 = new HappyC();
		obj2.New();
		obj2.Want();
		
	}

}
