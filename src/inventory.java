import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


public class inventory
{

	final private Scanner reader = new Scanner(System.in);
	
	public void main()
	{
		boolean adminLogin = false;
		boolean employeeLogin = false;
		int choice;

		LinkedList<item> invent = new LinkedList<item> ();
		LinkedList<employee> users = new LinkedList<employee> ();
		
		//LOGIN ACCESS GOES HERE
	
		admin boss = new admin("admin", "password");
		employee worker = new employee("employee", "password");
		
		if(adminLogin)
		{
			choice = getAdminChoice();
			
			while(choice != -1)
			{
				switch(choice)
				{
				case 1:
					boss.addItem(invent);
					break;
				case 2:
					boss.removeItem(invent);
					break;
				case 3:
					boss.addUser(users);
					break;
				case 4:
					boss.removeUser(users);
					break;
				case 5:
					boss.addStock(invent);
					break;
				case 6:
					boss.removeStock(invent);
					break;
				default:
					System.out.println("\nNot a valid Input");
					break;
				}
				
				choice = getAdminChoice();
			}
			
			System.out.println("\n Goodbye!");
		}
		else if(employeeLogin)
		{
			choice = getEmployeeChoice();
			
			while(choice != -1)
			{
				switch(choice)
				{
				case 1:
					worker.addStock(invent);
					break;
				case 2:
					worker.removeStock(invent);
					break;
				default:
					System.out.println("\nNot a valid Input");
					break;
				}
				
				choice = getEmployeeChoice();
			}
			
			System.out.println("\n Goodbye!");
		}
		
		else
		{
			System.out.println("\nNo valid login!!!\n\n");
		}
	}
	
	public int getAdminChoice()
	{
		int choice;
		
		System.out.print("WELCOME TO THE INVENTORY MANAGEMENT SYSTEM" + "\n" + 
		"===============================" + "\n" 
		+ "1) Add Item" + "\n" + "2) Remove Item" + 
		"\n" + "3) Add user" + "4) Remove user" + "5) Add Stock" + "6) Remove Stock" + "\n\n" + 
		"Please enter your option or -1 to quit: \n");
		
		choice = getIntInput();
		return choice;
	}
	
	public int getEmployeeChoice()
	{
		int choice;
		
		System.out.print("WELCOME TO THE INVENTORY MANAGEMENT SYSTEM" + "\n" + 
				"===============================" + "\n" 
				+ "1) Add Stock" + "\n" + "2) Remove Stock" + "\n\n" + 
				"Please enter your option or -1 to quit: \n");
		
		choice = getIntInput();
		return choice;
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
		
		return num;
	}
	
}