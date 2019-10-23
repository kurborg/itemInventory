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
	}
	
	public int login(String usern, String pass)
	{
		int success = 1;
		int fail = 0;
		
		if(usern == name && pass == password)
			return success;
		else 
			return fail;
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
			if(invent.get(i).getName()== name)
				invent.remove(i);
		}
		
		
		System.out.println("Item has been removed inventory! \n");
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
		
		if(pass == password)
		{
			for(int i = 0; i < users.size(); i++)
			{
				if(users.get(i).getName() == name)
					users.remove(i);
			}
		}

		System.out.println("Employee has been added to system! \n");
		
		
	}
	
	public void receiveAlerts(LinkedList<item> invent)
	{
		for(int i = 0; i < invent.size(); i++)
		{
			if(invent.get(i).getAmount() < 5)
				System.out.println("Item: " + invent.get(i).getName() + 
						" is low on stock.\n It has a remaining amount of:" + invent.get(i).getAmount());
		}
	}
}
