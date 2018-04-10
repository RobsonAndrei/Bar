package pucrs.fds;

public class Client 
{
	private String name, cpf, memberNumber;
	private int age;
	private char genre;
	private boolean isMember;
	
	public Client(String name, String cpf, int age, char genre, boolean isMember) 
	{
		super();
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.genre = genre;
		this.isMember = isMember;
	}
	
	public Client(String name, String cpf, String memberNumber, int age, char genre, boolean isMember) 
	{
		super();
		this.name = name;
		this.cpf = cpf;
		this.memberNumber = memberNumber;
		this.age = age;
		this.genre = genre;
		this.isMember = isMember;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setNome(String nome) 
	{
		this.name = nome;
	}
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public char getGenre() 
	{
		return genre;
	}
	
	public void setGenre(char genre) 
	{
		this.genre = genre;
	}

	public boolean getIsMember() 
	{
		return isMember;
	}

	public void setIsMember(boolean isMember) 
	{
		this.isMember = isMember;
	}
}
