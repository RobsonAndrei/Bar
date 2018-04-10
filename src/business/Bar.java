package pucrs.fds;

import java.util.ArrayList;

public class Bar 
{
	ArrayList<Client> clientsList = new ArrayList<>();
	
	public Bar() 
	{	}

	public int membersQuantity() 
	{
		int count = 0;

		for (Client cl : clientsList) 
		{
			if (cl.getIsMember() == true) 
			{
				count++;
			}
		}

		return count;
	}
	
	public int nonMembers() 
	{
		return clientsTotal() - membersQuantity();
	}

	public double menQuantity() 
	{
		int count = 0;

		for (Client cl : clientsList) 
		{
			if (cl.getGenre() == 'M') 
			{
				count++;
			}
		}
		
		return (count * 100)/ clientsTotal();
	}

	public double womenQuantity() 
	{
		int count = 0;

		for (Client cl : clientsList) 
		{
			if (cl.getGenre() == 'F') 
			{
				count++;
			}
		}

		return  (count * 100)/ clientsTotal();
	}

	public int clientsTotal() 
	{
		return clientsList.size();
	}
	
	public void entry(Client client) 
	{
		 clientsList.add(client);
	}
	
	public Client exit(String cpf) 
	{
		Client aux = null;
		
		for (Client client : clientsList) 
		{
			if(cpf.equals(client.getCpf())) 
			{
				clientsList.remove(client);
				aux = client;
			}
		}
		return aux;
	}
}
