package POO15;

public class Pessoa {

	private String nome;
	private String endereço;
	private String email;
	private int telefone;
	private long CPF;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String endereço, String email, long CPF, int telefone)
	{
		this.nome = nome;
		this.endereço = endereço;
		this.email = email;
		this.CPF = CPF;
		this.telefone = telefone;
	}
	public Pessoa(String nome, String email, int telefone)
	{
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}


	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereço() {
		return endereço;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public long getCPF() {
		return CPF;
	}


	public void setCPF(long cPF) {
		CPF = cPF;
	}
	
	
	
	
}
