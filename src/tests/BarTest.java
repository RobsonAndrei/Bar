package pucrs.fds.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pucrs.fds.Bar;
import pucrs.fds.Client;

class BarTest
{
	Bar bar;
	Client client1, client2, client3;
	ArrayList<Client> clientsList = new ArrayList<Client>();
	
	@BeforeEach
	void setUp() 
	{
		bar = new Bar();
		 client1 = new Client("Maria", "0987896654", 78, 'F', true);
		 client2 = new Client("Pedro", "3987234651", 22, 'M', false);
		 client3 = new Client("JerÃ´nimo", "1922896654", 51, 'M', true);
	}
	
	@Test
	public void entryTest() 
	{
		int total = bar.clientsTotal();
		
		bar.entry(client1);
		bar.entry(client2);
		bar.entry(client3);
		
		assertEquals(3, total);
	}
	
	@Test
	public void exitTest() 
	{
		int total = bar.clientsTotal();
		
		bar.entry(client1);
		bar.entry(client2);
		bar.entry(client3);
		
		bar.exit(client2.getCpf());
		
		assertEquals(2, total);
	}
	
	@Test
	public void menPercentTest() 
	{
		double mPercent = bar.menQuantity();
		
		bar.entry(client1);
		bar.entry(client2);
		bar.entry(client3);
		
		assertEquals(66.0, mPercent);	
	}
	
	@Test
	public void womenPercentTest() 
	{
		double wPercent = bar.womenQuantity();

		bar.entry(client1);
		bar.entry(client2);
		bar.entry(client3);
		
		assertEquals(33.0, wPercent);
	}
	
	@Test
	public void membersTotalTest() 
	{
		int total = bar.membersQuantity();
		
		bar.entry(client1);
		bar.entry(client2);
		bar.entry(client3);
		
		assertEquals(2, total);
	}
	
	@Test
	public void nonMembersTotalTest() 
	{
		int total = bar.nonMembers();
		
		bar.entry(client1);
		bar.entry(client2);
		bar.entry(client3);
		
		assertEquals(1, total);
	}
	
	@AfterEach
	void tearDown() 
	{
		
	}	
}
