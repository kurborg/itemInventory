import java.util.LinkedList;
import java.util.Scanner;

public class admin extends employee
{
	private String name;
	private String password;
	final private Scanner reader = new Scanner(System.in);
	
	admin(String adminName, String adminPass)
	{
		super(adminName, adminPass);
		this.name = adminName;
		this.password = adminPass;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int login(String usern, String pass)
	{
		
		if(usern.equals(name) && pass.equals(password))
			return 1;
		else 
			return 0;
	}
	
	public void addItem(LinkedList<item> invent)
	{
		String name;
		int amount;
		
		System.out.println("Please enter the item's name: \n");
		name = reader.nextLine();
		
		System.out.println("Please enter the amount to add: \n");
		amount = getIntInput();
		
		item newItem = new item(name, amount);
		
		invent.add(newItem);
		
		System.out.println("Item has been added to inventory! \n");
	}
	

	public void removeItem(LinkedList<item> invent)
	{
		String name;
		
		System.out.println("Please enter the item's name to remove: \n");
		name = reader.nextLine();
		
		for(int i = 0; i < invent.size(); i++)
		{
			if(invent.get(i).getName().equals(name))
			{
				invent.remove(i);
				System.out.println("Item has been removed inventory! \n");
				return;
			}
		}
		

		System.out.println("Item cannot be found!\n\n");
		
	}
	
	public void addUser(LinkedList<employee> users)
	{
		
		String name;
		String password;
		
		System.out.println("Please enter the employee's name: \n");
		name = reader.nextLine();
		
		System.out.println("Please enter the employee's desired password: \n");
		password = reader.nextLine();
		
		employee newEmployee = new employee(name,password);
		
		users.add(newEmployee);
		

		System.out.println("Employee has been added to system! \n");
	}
	
	public void removeUser(LinkedList<employee> users)
	{

		String name;
		String pass;
		
		System.out.println("Please enter the employee's name: \n");
		name = reader.nextLine();
		
		System.out.println("Please enter the admin password: \n");
		pass = reader.nextLine();
		
		if(pass.equals(password))
		{
			for(int i = 0; i < users.size(); i++)
			{
				if(users.get(i).getName().equals(name))
				{
					users.remove(i);
					System.out.println("Employee has been removed from the system! \n");
					return;
				}
			}
			
			System.out.println("Employee cannot be found in the system! \n");
		}
		
		
	}
	
	public void receiveAlerts(LinkedList<item> invent)
	{
		for(int i = 0; i < invent.size(); i++)
		{
			System.out.println("Item: " + invent.get(i).getName() + 
					"\nAmount:" + invent.get(i).getAmount() + "\n");
			if(invent.get(i).getAmount() < 5)
				System.out.println("Item: " + invent.get(i).getName() + 
						" is low on stock.\nIt has a remaining amount of:" + invent.get(i).getAmount() + "\n\n");
		}
		
		if(invent.size() < 1)
		{
			System.out.println("The inventory contains no items!\n\n");
		}
	}
	
	public int getAdminChoice()
	{
		int choice;
		
		System.out.print("WELCOME TO THE INVENTORY MANAGEMENT SYSTEM" + "\n" + 
		"===============================" + "\n" 
		+ "1) Add Item\n" + "2) Remove Item\n" + "3) Add user\n" + 
		"4) Remove user\n" + "5) Add Stock\n" + "6) Remove Stock\n" + 
		"7) Check Stock of all items\n\n\n" + 
		"Please enter your option or -1 to quit: \n");
		
		choice = getIntInput();
		return choice;
	}
}
