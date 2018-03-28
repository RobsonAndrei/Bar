package pucrs.fds;

//deborast.almeida@gmail.com
import java.util.ArrayList;

public class Bar {

	ArrayList<Cliente> listaClientes = new ArrayList<>();
	ArrayList<String> listaSociocomMilhas = new ArrayList<>();

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

		return (cont * 100) / totalClientes();
	}

	public double qtdMulheres() {
		int cont = 0;

		for (Cliente cl : listaClientes) {
			if (cl.getGenero() == 'F') {
				cont++;
			}

		}

		return (cont * 100) / totalClientes();
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
			if (cpf.equals(cliente.getCpf()))
				listaClientes.remove(cliente);
			aux = cliente;
		}
		return aux;
	}

	public Cliente getClienteCpf(String cpf) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getCpf().equals(cpf)) {
				return cliente;
			} else {
				System.out.println("Cliente não está no bar");
				return null;
			}
		}
		System.out.println("Cliente não está no bar");
		return null;
	}

	public void inserirMilhas(String cpf, int milha) {

		for (Cliente cliente : listaClientes) {
			if (cliente.getCpf().equals(cpf) & cliente.getSocio() == true) {
				cliente.setPontosMilhagens(milha);
				listaSociocomMilhas.add(cliente.getNumeroSocio());

			} else {
				System.out.println("Cliente ainda não é sócio ou Cpf informado está incorreto!!!");
			}
		}
	}

	public String clientNoBar() {
		String msn = "";
		for (Cliente cliente : listaClientes) {
			msn = msn + cliente.getNome() + "\n";
		}

		return msn;
	}

	public boolean cpfEstaNoBar(String cpf) {
		if (getClienteCpf(cpf) != null) {
			return true;
		}
		return false;
	}

}
