package POO15;

public class testeAviao {
	public static void main (String args []) {
		Aviao subiu = new Aviao ("Jato", "Gol", 1300, 900);
		
		System.out.println("\nLista de aviões:");
		subiu.imprimirInfo();		
		
		Aviao a = new Aviao (null, null, 0, 0);
		
		System.out.println("\nCrie um novo modelo para voar: \n");
		
		a.cadastrarTipo();
		a.cadastrarCompanhia();
		a.cadastrarVelocidade();
		a.cadastrarCapacidade();
		
		System.out.println("\n");
		a.imprimirCadastro();
		
		System.out.println("\nLista de aviões (atualizada):");
		subiu.imprimirInfo();
		a.imprimirInfo();
	}
}
