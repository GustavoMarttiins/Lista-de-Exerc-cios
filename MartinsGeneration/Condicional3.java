package MartinsGeneration;
import java.util.*;
public class Condicional3 
{
public static void main(String[] args)
{
	int idade;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Quantos anos você tem? ");
	idade = ler.nextInt();
	
	if (idade>=10 && idade<=14)
	{
		System.out.println("\nCategoria - Infantil");
	}
	else if(idade>=15 && idade<=17)
	{
		System.out.println("\nCategoria - juvenil");
	}
	else if(idade>=18 && idade<=25)
	{
		System.out.println("\nCategoria - Adulto");
	}
	else
	{
		System.out.println("\nIdade fora das categorias dispostas!");
	}
	
	
	
}
}
