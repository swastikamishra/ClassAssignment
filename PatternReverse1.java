package basicprogram;

public class PatternReverse1 {
public static void main (String args[])
{
	for (int i = 5; i>=1; i--) //For Row
	{
		for (int j = 1; j <=i; j++) // For Column
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
}
}
