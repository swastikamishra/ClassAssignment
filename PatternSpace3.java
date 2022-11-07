package basicprogram;

public class PatternSpace3 {
	public static void main (String []args)
	{
		int i,j,k;
		
		for (i=1;i<=5;i++) //For Row
		{
			for (j=4;j>=i;j--) // For Space
			{
				System.out.print(" ");
			}
		for (k=1;k<=i;k++) // For Column
		{
			System.out.print('*');
		}
			System.out.println();
		}
		
	}
}
