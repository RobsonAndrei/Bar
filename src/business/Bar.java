package business;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
//deborast.almeida@gmail.com
import java.util.ArrayList;
import java.util.Date;

public class Bar {

	private static final String path = "Dados.txt";

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
		Cliente aux = null;
		for (Cliente cliente : listaClientes) {
			if (cliente.getCpf().equals(cpf)) {
				aux = cliente;
			}
		}
		if (aux == null) {
			System.out.println("Cliente não está no bar!!!");
		}
		return aux;

	}

	public void inserirMilhas(String cpf, int milha) {
		Cliente aux = null;
		for (Cliente cliente : listaClientes) {
			if (cliente.getCpf().equals(cpf) & cliente.getSocio() == true) {
				cliente.setPontosMilhagens(milha);
				listaSociocomMilhas.add(cliente.getNumeroSocio());
				aux = cliente;

			} else {
				if (aux == null) {
					System.out.println("Cliente ainda não é sócio ou Cpf informado está incorreto!!!");
				}

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

	public void salvarNofinaldoDia() throws IOException {
		File file = new File(path);
		long begin = System.currentTimeMillis();
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write("Arquivo gravado em : " + new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date()));
		writer.newLine();
		writer.write("Caminho da gravação: " + path);
		writer.newLine();
		long end = System.currentTimeMillis();
		writer.write("Tempo de gravação: " + (end - begin) + "ms.");

		for (Cliente cliente : listaClientes) {
			writer.write("\nNome: " + cliente.getNome() + " Cpf:" + cliente.getCpf() + " Genero: " + cliente.getGenero() + " Idade: "+ cliente.getIdade() + " Socio: "+ cliente.getSocio() + " Pontos de Milhas: " + cliente.getPontosMilhagens());
		}

		writer.flush();
		// Fechando conexão e escrita do arquivo.
		writer.close();
		System.out.println("Arquivo gravado em: " + path);
	}

}
