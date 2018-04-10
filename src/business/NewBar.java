package pucrs.fds;

import java.util.ArrayList;

public class Bar 
{
	ArrayList<Client> clientsList = new ArrayList<>();
	
	public Bar() 
	{	}

	public int qtdSocios() 
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
	
	public int naoSocios() 
	{
		return totalClientes() - qtdSocios();
	}

	public double qtdHomems() 
	{
		int count = 0;

		for (Client cl : clientsList) 
		{
			if (cl.getGenre() == 'M') 
			{
				count++;
			}
		}
		
		return (count * 100)/ totalClientes();
	}

	public double qtdMulheres() 
	{
		int count = 0;

		for (Client cl : clientsList) 
		{
			if (cl.getGenre() == 'F') 
			{
				count++;
			}
		}

		return  (count * 100)/ totalClientes();
	}

	public int totalClientes() 
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
