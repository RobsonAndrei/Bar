package pucrs.fds.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pucrs.fds.Bar;
import pucrs.fds.Cliente;

class BarTeste {
	Bar b;
	Cliente cliente1, cliente2, cliente3;
	ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	@BeforeEach
	void setUp() {
		b = new Bar();
		 cliente1 = new Cliente("Maria", "0987896654", 78, 'F', true);
		 cliente2 = new Cliente("Pedro", "3987234651", 22, 'M', false);
		 cliente3 = new Cliente("Jerônimo", "1922896654", 51, 'M', true);
	}
	@Test
	public void testEntrada() {
		b.entrada(cliente1);
		b.entrada(cliente2);
		b.entrada(cliente3);
		int total = b.totalClientes();
		assertEquals(3, total);
		
	}
	
	@Test
	public void testSaida() {
		b.entrada(cliente1);
		b.entrada(cliente2);
		b.entrada(cliente3);
		b.saida(cliente2.getCpf());
		int total = b.totalClientes();
		assertEquals(2, total);
		
		
		
	}
	
	@Test
	public void testepercentHomem() {
		b.entrada(cliente1);
		b.entrada(cliente2);
		b.entrada(cliente3);
		
		double ho = b.qtdHomems();
		assertEquals(66.0, ho);
		
		
		
	}
	
	@Test
	public void testepercentMulheres() {
		b.entrada(cliente1);
		b.entrada(cliente2);
		b.entrada(cliente3);
		
		double ho = b.qtdMulheres();
		assertEquals(33.0, ho);
		
		
		
	}
	
	@Test
	public void TesteTotalSocios() {
		b.entrada(cliente1);
		b.entrada(cliente2);
		b.entrada(cliente3);
		
		int total = b.qtdSocios();
		assertEquals(2, total);
		
		
		
	}
	
	@Test
	public void TesteTotalNaoSocios() {
		b.entrada(cliente1);
		b.entrada(cliente2);
		b.entrada(cliente3);
		
		int total = b.naoSocios();
		assertEquals(1, total);
		
		
		
	}
	
	@AfterEach
	void tearDown() {
		
	}

}
