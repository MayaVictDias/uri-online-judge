package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1015 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, distanciaEntreDoisPontos;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		sc.close();
		
		distanciaEntreDoisPontos = Math.sqrt(
				Math.pow((x2 - x1), 2)
				+ Math.pow((y2 - y1), 2)
				);
		
		System.out.printf("%.4f%n", distanciaEntreDoisPontos);

	}

}
