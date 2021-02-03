package POO15;

public class Eletronico {
	private String nome;
	private String marca;
	private int ano;
	
	
	
	
		public Eletronico(){
			
		}
		
	public Eletronico(String nome, String marca, int ano) {
			
			this.nome = nome;
			this.marca = marca;
			this.ano = ano;
		}

	public void imprimirInfo() 
	{
		System.out.println(nome+ " " + marca + " " + ano);
	}
	
	
	
}
