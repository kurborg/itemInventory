import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class inventory
{
	
	public static void main(String[] args) 
	{

		Scanner reader = new Scanner(System.in);
		int choice;
		int loginChoice = 0;
		String usern;
		String passw;

		LinkedList<item> invent = new LinkedList<item> ();
		LinkedList<employee> users = new LinkedList<employee> ();
		
		admin boss = new admin("admin", "password");
		employee worker = new employee("employee", "password");
		
		//System.out.println(boss.getName());
		//System.out.println(boss.getPassword());
		//LOGIN ACCESS GOES HERE

		System.out.println("Press 1 to login as admin or 2 to login as an employee: ");
		
		while(loginChoice == 0)
		{
			try
			{
				loginChoice = reader.nextInt();
				
				if (loginChoice == 0)
					throw new InputMismatchException();
				reader.nextLine();
			}
			catch(InputMismatchException e)
			{
				reader.nextLine();
				System.out.println("\nError Invalid Input: Please try again");
			}
		}
		
		
		if(loginChoice == 1)
		{

			System.out.println("Please enter the admin username: \n");
			usern = reader.nextLine();
			
			System.out.println("Please enter the admin password: \n");
			passw = reader.nextLine();
			
			if (boss.login(usern, passw) == 1)
			{
				choice = boss.getAdminChoice();
				
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
					case 7:
						boss.receiveAlerts(invent);
						break;
					default:
						System.out.println("\nNot a valid Input");
						break;
					}
					
					choice = boss.getAdminChoice();
				}
				
				System.out.println("\n Goodbye!");
			}
			else
				System.out.println("Incorrect Login and Password! Goodbye");
		}
		else if(loginChoice == 2)
		{
			

			System.out.println("Please enter the employee username: \n");
			usern = reader.nextLine();
			
			System.out.println("Please enter the employee password: \n");
			passw = reader.nextLine();
			
			if (worker.login(usern, passw) == 1)
			{
				choice = worker.getEmployeeChoice();
				
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
					
					choice = worker.getEmployeeChoice();
				}
				
				System.out.println("\n Goodbye!");
			}
			else
				System.out.println("Incorrect Login and Password! Goodbye");
		}
		
	else
	{
		System.out.println("\nNo valid login choice!!!\n\n");
	}
		
		reader.close();
	}
	
}
