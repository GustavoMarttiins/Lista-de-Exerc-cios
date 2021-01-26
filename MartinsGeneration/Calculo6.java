package MartinsGeneration;

	import java.util.Scanner;
	
	public class Calculo6 {
	public static void main(String[] args) {
		
	
	double x1,x2,y1,y2,D;
	
	try (Scanner ler = new Scanner (System.in)){
			
	System.out.println("\nEntre com o valor de x1: ");
	x1 = ler.nextInt();
	System.out.println("\nEntre com o valor de x2: ");
	x2 = ler.nextInt();
	System.out.println("\nEntre com o valor de y1: ");
	y1 = ler.nextInt();
	System.out.println("\nEntre com o valor de y2: ");
	y2 = ler.nextInt();
	
	
			
	D = Math.sqrt (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));
			System.out.printf("\nO valor final é de: "+D);
		}
	}
}

