package POO15;

public class Pregui�a extends Animal  {
	
	public  Pregui�a(String nome, int idade)
	{
		super(nome, idade);
	}
	
	@Override
	public void emitir()
	{
		System.out.println("HMMMMM soninho");
	}
	
	@Override
	
	public void movimento()
	{
		System.out.println("Subindo em uma arvore");
	}
}
