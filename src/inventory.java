import java.util.LinkedList;


public class inventory
{
	
	public static void main(String[] args) 
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
		else if(employeeLogin)
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
		{
			System.out.println("\nNo valid login!!!\n\n");
		}
	}
	
}