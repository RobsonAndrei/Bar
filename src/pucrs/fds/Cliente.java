package pucrs.fds;

public class Cliente {
	private String nome, cpf, numSocio;
	private int idade;
	private char genero;
	private boolean socio;
	
	public Cliente(String nome, String cpf, int idade, char genero, boolean socio) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
		this.socio = socio;
	}
	
	public Cliente(String nome, String cpf, String numSocio, int idade, char genero, boolean socio) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numSocio = numSocio;
		this.idade = idade;
		this.genero = genero;
		this.socio = socio;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}

	public boolean getSocio() {
		return socio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}
}
