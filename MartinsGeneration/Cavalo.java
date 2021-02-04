package POO15;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade)
	{
		super(nome, idade);
	}
	
	@Override
	public void emitir()
	{
		System.out.println("Cavalooooo");
	}
	
	@Override
	public void movimento()
	{
		System.out.println("Correndo muito");
	}
}
