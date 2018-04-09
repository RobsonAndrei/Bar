package business;

public class Cliente {
	private String nome, cpf, numSocio;
	private int idade, pontosMilhagens;
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

	public void setNumeroSocio(String numero) {
		this.numSocio = numero;
	}

	public String getNumeroSocio() {
		return this.numSocio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}

	public void setNumSocio(String numSocio) {
		this.numSocio = numSocio;
	}

	public void setPontosMilhagens(int pontosMilhagens) {
		this.pontosMilhagens = pontosMilhagens;
	}

	public int getPontosMilhagens() {
		return pontosMilhagens;
	}

}
