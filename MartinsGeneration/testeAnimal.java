package POO15;

public class testeAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("MAX", 3);
		Cavalo cavalo = new Cavalo("Alavo", 5);
		Pregui�a pregui�a = new Pregui�a("Henrique", 6);
		System.out.println("O animal: "+ cachorro.getNome()+ "\nCom: "+ cachorro.getIdade()+ " de idade");
		cachorro.emitir();
		cachorro.movimento();
		System.out.println();
		System.out.println("************************");
		System.out.println();
		System.out.println("O animal: "+cavalo.getNome()+ "\nCom: " +cavalo.getIdade()+ "de idade");
		cavalo.emitir();
		cavalo.movimento();
		System.out.println();
		System.out.println("************************");
		System.out.println("O animal: "+pregui�a.getNome()+ "\nCom: " +pregui�a.getIdade()+ "de idade");
		pregui�a.emitir();
		pregui�a.movimento();
		
		
		
		
		
		

	}

}
