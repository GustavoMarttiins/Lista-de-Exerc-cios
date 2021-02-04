package POO15;

public class testeADM {
public static void main(String[] args) {
	
	Administrador adm = new Administrador("Gustavo Martins de Souza", "gm@gm.com",40028922, "Aroporte de Congonhas - SP" ,"Aeroporto de Porto Alegre - RS ", "GOLL", 1500.00);
	
	System.out.println("Nome: "+adm.getNome()+ "\nEmail: "+adm.getEmail()+ "\nTelefone para contato: "+adm.getTelefone());
	
	adm.ajudaDeCusto();
	
			
  }
}
