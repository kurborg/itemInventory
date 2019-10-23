import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class employee
{
	private String name;


	private String password;
	final private Scanner reader = new Scanner(System.in);
	
	employee(String username, String passw)
	{
		name = username;
		password = passw;
	}
	
	public String getName() {
		return name;
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
	
	public void addStock(LinkedList<item> invent)
	{
		String name;
		int amount;
		
		System.out.println("Please enter the item's name: \n");
		name = reader.nextLine();
		
		System.out.println("Please enter the amount to add: \n");
		amount = getIntInput();
		
		for(int i = 0; i < invent.size(); i++)
		{
			if(invent.get(i).getName() == name)
				invent.get(i).amount += amount;
		}
		
		System.out.println("Item stock has been replenished!\n");
	}
	
	public void removeStock(LinkedList<item> invent)
	{
		String name;
		int amount;
		
		System.out.println("Please enter the item's name: \n");
		name = reader.nextLine();
		
		System.out.println("Please enter the amount to add: \n");
		amount = getIntInput();
		
		for(int i = 0; i < invent.size(); i++)
		{
			if(invent.get(i).getName() == name)
				invent.get(i).amount -= amount;
		}
		

		System.out.println("Item stock has been removed!\n");
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
}