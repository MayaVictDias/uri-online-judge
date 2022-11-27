package iniciante;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int distanciaPercorrida = sc.nextInt();
		double combustivelGasto = sc.nextDouble();
		
		sc.close();
		
		double consumoMedio = distanciaPercorrida / combustivelGasto;
		
		System.out.printf("%.3f km/l%n", consumoMedio);

	}

}
