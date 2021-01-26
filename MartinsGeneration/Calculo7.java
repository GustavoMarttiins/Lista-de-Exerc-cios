package MartinsGeneration;
	import java.util.Scanner;
	public class Calculo7 {
	public static void main(String[] args) {
	
		double a,b,c,d,e,f,x,y;
		
		try (Scanner ler = new Scanner (System.in)){
			
			System.out.println("\nEntre com o valor de A: ");
			a = ler.nextDouble();
			System.out.println("\nEntre com o valor de B: ");
			b = ler.nextDouble();
			System.out.println("\nEntre com o valor de C: ");
			c = ler.nextDouble();
			System.out.println("\nEntre com o valor de D: ");
			d = ler.nextDouble();
			System.out.println("\nEntre com o valor de E: ");
			e = ler.nextDouble();
			System.out.println("\nEntre com o valor de F: ");
			f = ler.nextDouble();
					
			x = (c*e) - (b-f) / (a*e) - (b*d);
			
			y = (a*f) - (c*d) / (a*e) - (b*d);
			
			System.out.println("\nO valor de X é de: "+x );
			
			System.out.println("\nE o valor de Y é de: "+y);
		}
}
}
