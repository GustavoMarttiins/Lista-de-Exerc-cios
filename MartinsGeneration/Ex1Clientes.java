package POO15;

public class Clientes {
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomeDoMeio;
	private String email;
	private int idade;
	//public String getprimeiroNome;
	public String getprimeiroNome;
	
	public Clientes(String primeiroNome,String nomeDoMeio, String ultimoNome, String email, int idade)
	{
		this.primeiroNome = primeiroNome;
		this.nomeDoMeio = nomeDoMeio;
		this.ultimoNome = ultimoNome;
		this.email = email;
		this.idade = idade;
	}
	public void imprimirInfo()
	{
		System.out.println("Cliente: " +primeiroNome+ " "+nomeDoMeio+" "+ultimoNome+ "\nE-mail para contato: "+email+"\nCom: "+idade+ "anos.");
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public String getNomeDoMeio() {
		return nomeDoMeio;
	}
	public void setNomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
