package MartinsGeneration;
import java.lang.Math;
public class Vetor1 {
public static void main(String[] args) {
	
	float soma=0,media = 0;
	int c,maior=0;
	int b[] = new int[10];
	
	
			for(c=0;c<10;c++) {
		
			int random = 1 + (int) (Math.random() * 6);
			System.out.printf("\nO valor do %do. lançamento é: %d",c+1,random);
			soma = soma + random;
			b[c] = random;
			
			
				if(random == 6 ){
					maior++;
				}
							}
	
			media = soma/10;
		
	
		
		System.out.printf("\nA média é de: %1.2f",media);
		System.out.printf("\nTotal das vezes que o dado com 6 é de: %d",maior);
		
	}
}	
