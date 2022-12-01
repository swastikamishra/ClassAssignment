package OOPsconcepts;

public class BlankFinal {
final int var; //Blank final variable i.e undefined.
final static int num; // Static final variable
static    //static block has to be declared for static variable
{
	num = 15;
}

final void display ()
{
System.out.println(var+" "+num); 
}
public BlankFinal(int var) // Constructor to assign value to variable.
{
	this.var=var;
}
public static void main (String []args)
{
	BlankFinal obj = new BlankFinal (10); //Creating object of the class and assigning a final value
	obj.display(); //Calling the display method to print output
}
}
