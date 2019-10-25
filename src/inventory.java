import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class inventory
{
	
	public static void main(String[] args) 
	{

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int choice;
		int loginChoice = 0;
		String usern;
		String passw;
		String retEmp;
		String retItem;
		fileHandler fh = new fileHandler();
		fileHandlerInventory fhi = new fileHandlerInventory();

		LinkedList<item> invent = fhi.readFile();
		LinkedList<employee> users = fh.readFile();
		
		admin boss = new admin("admin", "password");
		
		
		//System.out.println(boss.getName());
		//System.out.println(boss.getPassword());
		//LOGIN ACCESS GOES HERE
		//IF THEY CLICK ADMIN LOGIN THEN LOGINCHOICE == 1
		//IF THEY CLICK EMPLOYEE LOGIN THEN LOGINCHOICE == 2
		//IF THEY CLICK CANCEL THEN EXIT THE PROGRAM

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
						retItem = boss.addItem(invent);
						fhi.appendFile(retItem);
						break;
					case 2:
						boss.removeItem(invent);
						fhi.overwriteFile(invent);
						break;
					case 3:
						retEmp = boss.addUser(users);
						fh.appendFile(retEmp);
						break;
					case 4:
						boss.removeUser(users);
						fh.overwriteFile(users);
						break;
					case 5:
						boss.addStock(invent);
						fhi.overwriteFile(invent);
						break;
					case 6:
						boss.removeStock(invent);
						fhi.overwriteFile(invent);
						break;
					case 7:
						boss.receiveAlerts(invent);
						break;
					case 8:
						boss.showEmployees(users);
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
			
			for(int i = 0; i < users.size(); i++)
			{
				if(users.get(i).getName().equals(usern) && users.get(i).getPassword().equals(passw))
				{
					employee worker = new employee(usern,passw);
					
					if (worker.login(usern, passw) == 1)
					{
						choice = worker.getEmployeeChoice();
						
						while(choice != -1)
						{
							switch(choice)
							{
							case 1:
								worker.addStock(invent);
								fhi.overwriteFile(invent);
								break;
							case 2:
								worker.removeStock(invent);
								fhi.overwriteFile(invent);
								break;
							case 3:
								worker.receiveAlerts(invent);
								break;
							default:
								System.out.println("\nNot a valid Input");
								break;
							}
							
							choice = worker.getEmployeeChoice();
						}
						
						System.out.println("\n Goodbye!");
						return;
					}
				}
			}
				System.out.println("Incorrect Login and Password! Goodbye");
			}
			
	else
	{
		System.out.println("\nNo valid login choice!!!\nGoodbye!\n");
	}
		
		reader.close();
	}
	
}
