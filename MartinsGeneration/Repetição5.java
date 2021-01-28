package MartinsGeneration;
import java.util.*;
public class Repetição5 {
public static void main(String[] args) {
	
	
	
	int num1=0,soma=0;
	Scanner ler = new Scanner(System.in);
	
	
	do 
	{
		System.out.println("\nEntre com um número: ");
		num1 = ler.nextInt();
		
		if(num1==0) 
		{
			System.out.println("Soma Realizada!");
		}
		else 
		{
			soma = soma +num1;	
		}
		
	}	
		while(num1!=0); 
		{
		
			System.out.println("\nA soma total dos números é de: "+soma);
		}
	
}
}
