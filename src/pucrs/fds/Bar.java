package pucrs.fds;
//deborast.almeida@gmail.com
import java.util.ArrayList;

public class Bar {
	ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	public Bar() {
		
	}

	public int qtdSocios() {
		int cont = 0;

		for (Cliente cl : listaClientes) {
			if (cl.getSocio() == true) {
				cont++;
			}

		}

		return cont;
	}
	
	
	public int naoSocios() {
		return totalClientes() - qtdSocios();
	}

	public double qtdHomems() {
		int cont = 0;

		for (Cliente cl : listaClientes) {
			if (cl.getGenero() == 'M') {
				cont++;
			}

		}
		
		return (cont * 100)/ totalClientes();
	}

	public double qtdMulheres() {
		int cont = 0;

		for (Cliente cl : listaClientes) {
			if (cl.getGenero() == 'F') {
				cont++;
			}

		}

		return  (cont * 100)/ totalClientes();
	}

	public int totalClientes() {
		return listaClientes.size();
	}
	
	public void entrada(Cliente cliente) {
		 listaClientes.add(cliente);
	}
	
	public Cliente saida(String cpf) {
		Cliente aux = null;
		
		for (Cliente cliente : listaClientes) {
			if(cpf.equals(cliente.getCpf()))
				listaClientes.remove(cliente);
				aux = cliente;
		}
		return aux;
	}
	
	

}
