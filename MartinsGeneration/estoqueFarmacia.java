package POO15;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class estoqueFarmacia {

	public static void main(String[] args) {
		int op;
		
		
		
		
		try (Scanner ler = new Scanner (System.in)){
			
		
		List<Remedio> estoque = new ArrayList<Remedio>();
		
		
		do {
			System.out.println(                "Digite uma opção");
			System.out.println();
			System.out.println("1-- Adicionar Produto\n2-- Remover Produto\n3-- Atualizar Produto\n4-- Total dos produtos\n0-- Programa Finalizado ");
			System.out.println();
			op = ler.nextInt();
			
			
			
			switch(op)
			{
			case 1:
				ler.nextLine();
				System.out.println("Digite o nome do produto para adicionar no estoque");
				String produto = ler.nextLine();
				System.out.println("Insira a quantidade do produto");
				int quantidade = ler.nextInt();
				estoque.add(new Remedio(produto, quantidade));
				
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("Digite o nome do produto para remover do estoque");
				String produtoMed = ler.nextLine();
				for(Remedio p: estoque)
				{
					if(p.getNome()==produtoMed)
					{
						estoque.remove( p); 
					}
				}
				break;
				
			
			case 3:
				ler.nextLine();
				System.out.println("Qual produto deseja atualizar? ");
				String verifica = ler.nextLine();
				System.out.println("Quanl produto irá substituir "+verifica+":");
				String novo = ler.nextLine();
				for(Remedio h: estoque)
				{
					if(h.getNome()== verifica)
					{
						estoque.remove(h);
						estoque.add(new Remedio (novo, h.getQuantidade()) );
					}
					else
					{
						System.out.println("Produto indisponível");
					}
				}
				
				
				System.out.println(estoque);
				break;
			case 4:
				for(Remedio h: estoque) {
				System.out.println("Total dos produtos em estoque: "+h.toString());
				}
				break;
				
										
			default:
				System.out.println("Programa finalizado");
			}
		}while(op !=0);
			
		}
	}
}
