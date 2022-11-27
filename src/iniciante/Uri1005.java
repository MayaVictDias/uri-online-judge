package iniciante;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		nota1 = sc.nextDouble(); // Recebe a primeira nota do aluno
		nota2 = sc.nextDouble(); // Recebe a segunda nota do aluno
		
		// Peso das notas: nota1 = 3.5, nota2 = 7.5
		
		media = ((nota1 * 3.5) + (nota2 * 7.5)) / (3.5 + 7.5); // Formula do calculo de media ponderada
		
		sc.close();
		
		System.out.printf("MEDIA = %.5f%n", media);

	}

}
