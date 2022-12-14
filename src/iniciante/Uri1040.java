package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		// Recebe o valor das médias
		
		float n1 = scanner.nextFloat();
		float n2 = scanner.nextFloat();
		float n3 = scanner.nextFloat();
		float n4 = scanner.nextFloat();
		
		
		// Calcular a média com pesos 2, 3, 4 e 1, respectivamente
		
		float media = (2f * n1 + 3f * n2 + 4f * n3 + 1f * n4) 
				/ 10f;
		
		System.out.printf("Media: %.1f%n", media);
		
		if(media >= 7f) {
			
			System.out.println("Aluno aprovado.");
			
		} else if(media < 5f){
				
			System.out.println("Aluno reprovado.");
			
		} else {
			
			System.out.println("Aluno em exame.");
			
			System.out.print("Nota do exame: ");
			float notaExame = scanner.nextFloat();
			
			float mediaExame = (media + notaExame) / 2f;
			
			if(mediaExame >= 5f) {
				
				System.out.println("Aluno aprovado.");
				
			} else {
				
				System.out.println("Aluno reprovado.");
			}
			
			System.out.printf("Media final: %.1f%n", mediaExame);
			
		}
		
		scanner.close();
	}
}
