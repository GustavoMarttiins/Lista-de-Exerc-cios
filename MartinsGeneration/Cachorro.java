package POO15;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade)
	{
		super(nome, idade);
	}
	
	@Override
	public void emitir()
	{
		
	System.out.println("Auu... auu.. auu..");
		
	}
	
	@Override
	public void movimento()
	{
		System.out.println("Correndo...");
	}
	

}
