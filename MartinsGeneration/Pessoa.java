package POO15;

public class Pessoa {

	private String nome;
	private String endere�o;
	private String email;
	private int telefone;
	private long CPF;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String endere�o, String email, long CPF, int telefone)
	{
		this.nome = nome;
		this.endere�o = endere�o;
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


	public String getEndere�o() {
		return endere�o;
	}


	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
