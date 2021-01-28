package MartinsGeneration;

import java.util.Scanner;

public class Repetição3 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	int idade = 0,totalPessoas21=0,totalPessoas50=0;
	
	
	
	while(idade!=-99)
	{
		System.out.println("\nDigite sua idade: ");
		idade = ler.nextInt();
		
		if(idade<=21)
		{
			totalPessoas21++;
		}
		else
		{
			totalPessoas50++;
		}
		if(idade>21 && idade <50)
		{
			System.out.println("\nIdade fora da avaliação, tente novamente");
		}
		
	}
	System.out.println("\nO total de pessoas com 21 anos é de: "+totalPessoas21+"\nE o total de pesspas com 50 anos é de: "+totalPessoas50);
	//idade = ler.nextInt();
	
}

}
