package MartinsGeneration;
import java.util.*;
public class Condicional1 {
public static void main(String[] args) 
{
	Scanner ler = new Scanner(System.in);
	
	int numero,numeroMaior;
	System.out.println("Digite um número: ");
	numero = ler.nextInt();
	
	numeroMaior = numero;
	
	System.out.println("\nDigite outro numero: ");
	numero = ler.nextInt();
	
	numero = numeroMaior;
	
	if(numero > numeroMaior)
	{
		numeroMaior = numero;
	}
	
	System.out.println("\nDigite outro número: ");
	numero = ler.nextInt();
	
	if(numeroMaior > numero)
	{
		numero = numeroMaior;
	}
	System.out.printf("\nMaior número é o: %d",numeroMaior);


	
	
			
	
	
	
}
}
