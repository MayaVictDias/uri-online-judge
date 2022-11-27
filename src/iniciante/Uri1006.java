package iniciante;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		nota1 = sc.nextDouble(); // Recebe a primeira nota do aluno
		nota2 = sc.nextDouble(); // Recebe a segunda nota do aluno
		nota3 = sc.nextDouble(); // Recebe a terceira nota do aluno
		
		// Peso das notas: nota1 = 2, nota2 = 3, nota3 = 5
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5); 
		// Formula do calculo de media ponderada
		
		sc.close();
		
		System.out.printf("MEDIA = %.1f%n", media);

	}

}
