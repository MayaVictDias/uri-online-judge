package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1013 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maiorAB, maiorNumero;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sc.close();
		
		// Formula para calcular se qual é maior: a ou b
		maiorAB = (a + b + Math.abs(a - b)) / 2;
		maiorNumero = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		
		/*
		if (a > b && a > c) {
			maiorAB = a;
		} else if (b > a && b > c) {
			maiorAB = b;
		} else {
			maiorAB = c;
		}
		*/
		
		System.out.println(maiorNumero + " eh o maior");

	}

}
