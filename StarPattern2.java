package basicprogram;

public class StarPattern2 
{
	public static void main(String args [])
	{
		for (int i = 1;i<=5;i++) //For Row
		{
			for (int j = 1; j<=i; j++) //For Column
				{
				System.out.print("*");
				}
			System.out.println();
			}
		for (int i =1; i<=4; i++) // Reverse 
			{
			for (int j =4;j>=i;j--)
				{
				System.out.print("*");
				}
			System.out.println();
			}
		}
	}
	
