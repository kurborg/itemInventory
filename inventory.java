package itemInventory;

import java.util.InputMismatchException;
import java.util.Scanner;

final public Scanner reader = new Scanner(System.in);	

public class inventory
{

	LinkedList<item> invent;
	
	public void main()
	{
		
	}
	
	
	
	public int getIntInput()
	{
		int num = 0;
		
		while(num == 0)
		{
			try
			{
				num = reader.nextInt();
				
				if (num == 0)
					throw new InputMismatchException();
				reader.nextLine();
			}
			catch(InputMismatchException e)
			{
				reader.nextLine();
				System.out.println("\nError Invalid Input: Please try again");
			}
		}
	}
}