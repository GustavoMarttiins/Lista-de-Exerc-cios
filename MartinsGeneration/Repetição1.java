package MartinsGeneration;

public class Repeti��o1 {
public static void main(String[] args) {
	
	int divisao,x;
	
	for (x=1000;x<=1999;x++)
	{
		divisao = x%11;
		if (divisao==5)
		{
			System.out.println("O n�mero: "+x+" \ndividido por 11 tem resto igual a 5: ");
		}
	}
	
	}
}
