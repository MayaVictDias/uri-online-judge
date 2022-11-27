package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes 
 * da equação de Bhaskara. Se não for possível calcular as raízes, 
 * mostre a mensagem correspondente “Impossivel calcular”, caso 
 * haja uma divisão por 0 ou raiz de numero negativo.
 */
public class Uri1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c, delta, raiz1, raiz2;
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		scanner.close();
		
		delta = Math.pow(b, 2) - (4 * a * c);
		
		if(delta < 0 || a <= 0 || b <= 0 || c <= 0) {
			
			System.out.println("Impossivel calcular");
			
		} else {
			
			raiz1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
			raiz2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("R1 = %.5f\n", raiz1);
			System.out.printf("R2 = %.5f\n", raiz2);
			
		}
	}
}
