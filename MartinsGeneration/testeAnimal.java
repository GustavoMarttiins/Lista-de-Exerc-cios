package POO15;

public class testeAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("MAX", 3);
		Cavalo cavalo = new Cavalo("Alavo", 5);
		Preguiça preguiça = new Preguiça("Henrique", 6);
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
		System.out.println("O animal: "+preguiça.getNome()+ "\nCom: " +preguiça.getIdade()+ "de idade");
		preguiça.emitir();
		preguiça.movimento();
		
		
		
		
		
		

	}

}
