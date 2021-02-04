package POO15;

public class Fornecedor extends Pessoa{

	

	private int valorCredito;
	private int valorDivida;
	
		
	public Fornecedor(String nome, String endereço, String email, long CPF, int telefone, int valorCredito, int valorDivida)
	{
		super(nome, endereço, email, CPF, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
	
	public void dadosPessoais()
	{
		System.out.println("Seu credito é de: "+ valorCredito + "\nSua divida é de: "+ valorDivida + "\nSeu saldo final é de: "+obterSaldo());
	}
	public int obterSaldo()
	{
		return valorCredito - valorDivida;
	}

	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public int getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}

	
	
	
}
