package MartinsGeneration;

import java.util.Scanner;

public class Calculo4 {
	
	public static void main(String[] args) {
		
		int a,b,c,R,S,D;
		
		try (Scanner ler = new Scanner (System.in)) {
			
		
		System.out.println("\nPara o calculo R, entre com o valor de A: ");
		a = ler.nextInt();
		System.out.println("\nPara o calculo R, entre com o valor de B: ");
		b = ler.nextInt();
		
		
	
		
		R = (a + b);
		Math.pow(R, 2);
		
		System.out.println("\nO valor de R é de: "+R);
		
		
		System.out.println("\nPara o calculo S, entre com o valor de B: ");
		b = ler.nextInt();
		System.out.println("\nPara o calculo S, entre com o valor de C: ");
		c = ler.nextInt();
		
		S = b + c;
		Math.pow(S, 2);
		
		System.out.println("\nO valor de S é de: "+S);
				
		D = (R + S)/2;
		
		System.out.println("\nO resultado é de: "+D);
		
		
		}
	}
}
