package POO15;

public class testeFornecedor {

	public static void main(String[] args) {
		

		Fornecedor forn = new Fornecedor("Gustavo Martins de Souza", "Rua Onde o vento faz a curva, nº 94",
				"GMS@hotmail.com",96465465823l,40028922,5000,352);
		
		
		System.out.println("Dados do Fornecedor: \n"+"Nome: "+forn.getNome()+ "\nEndereço: "+forn.getEndereço()+ "\nEmail: " +forn.getEmail()+ "\nCPF: "+forn.getCPF()+ "\nTelefone para Contato: "+forn.getTelefone());
		forn.dadosPessoais();
	
		
	}
	

}
