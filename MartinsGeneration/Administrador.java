package POO15;

public class Administrador extends Pessoa {

	
	private String origen;
	private String destino;
	private String compahiaAerea;
	private double preco;
	
	
	
	public Administrador(String nome, String email,int telefone, String origen, String destino, String compahiaAerea, double preco)
	{
		super(nome, email, telefone);
		this.destino = destino;
		this.origen = origen;
		this.compahiaAerea = compahiaAerea;
		this.preco = preco;
	}
	
			
	public void ajudaDeCusto()
	{
		System.out.println("\nSendo o local de origen: "+ origen + "\nCom destino até: "+ destino + 
				"\nPela compahia aerea: "+ compahiaAerea+ "\nO valor total da sua viagem é: "+ preco );
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getCompahiaAerea() {
		return compahiaAerea;
	}
	public void setCompahiaAerea(String compahiaAerea) {
		this.compahiaAerea = compahiaAerea;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
