package MartinsGeneration;
import java.util.Scanner;
public class Matrix4 {
public static void main(String[] args) {
	
	int mat[][] = new int[3][3],l,c,somaMat=0,somaD=0;
	
	Scanner ler = new Scanner(System.in);
	
	for (l=0;l<3;l++)
	{
		for (c=0;c<3;c++)
		{
			System.out.printf("\nEntre com o valor da matrix[%d] [%d]: ",(l+1),(c+1));
			mat[l][c] = ler.nextInt();
			
			somaMat = somaMat + mat[l][c];
			
			if(l == c)
			{
				somaD = somaD + mat[l][c];
			}
		}
	}
	System.out.println("\nO valor da soma total é: "+somaMat);
	System.out.println("\nO valor da soma total da diagonal é de: "+somaD);
	
	
}
}
