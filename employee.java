public class employee
{
	private String name;
	private String password;
	
	public addStock(inventory* inv, String itemName, int amount)
	{
		for(int i = 0; i < inv.size(); i++)
		{
			if(itemName == inv.name[i])
				inv.name[i] += amount;
		}
	}
	
	public subtractStock(inventory* inv, String itemName, int amount)
	{
		for(int i = 0; i < inv.size(); i++)
		{
			if(itemName == inv.name[i])
				inv.name[i] -= amount;
		}
	}
}