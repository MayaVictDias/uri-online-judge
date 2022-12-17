package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1045 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		
		scanner.close();
		
		// ordenar n1, n2 e n3 do maior pro menor
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		if(n1 > n2) {
			if(n1 > n3) {
				a = n1; 
				if(n2 > n3) {
					b = n2;
					c = n3;
				} else {
					b = n3;
					c = n2;
				}
			} else {
				a = n3;
				b = n1;
				c = n2;
			}
		} else if (n1 > n3) {
			if(n2 > n1) {
				a = n2;
				b = n1;
				c = n3;
			} else {
				a = n2;
				b = n3;
				c = n1;
			}
		} else {
			c = n1;
			if(n2 > n3) {
				a = n2;
				b = n3;
			} else {
				a = n3;
				b = n2;
			}
		}
		
		if(a >= (b + c)) {
			
			System.out.println("NAO FORMA TRIANGULO");
			
		} else {
			
			if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
				
				System.out.println("TRIANGULO RETANGULO");
				
			} else if(Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
				
				System.out.println("TRIANGULO OBTUSANGULO");
				
			} else if(Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
				
				System.out.println("TRIANGULO ACUTANGULO");
				
			}
			if(a == b && b == c && a == c) {
				
				System.out.println("TRIANGULO EQUILATERO");
				
			} else if(a == b || b == c || a == c) {
				
				System.out.println("TRIANGULO ISOSCELES");
				
			}
		}
		
	}

}
