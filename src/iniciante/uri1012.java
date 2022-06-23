package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class uri1012 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// Receber 3 valores do tipo double
		
		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		sc.close();

		/*
		* a) a área do triângulo retângulo que tem A por base e C por altura. 
		* b) a área do círculo de raio C. (pi = 3.14159) 
		* c) a área do trapézio que tem A e B por bases e C por altura. 
		* d) a área do quadrado que tem lado B. 
		* e) a área do retângulo que tem lados A e B.
		*/ 
		
		areaTriangulo = (a * c) / 2;
		areaCirculo = Math.pow(c, 2) * 3.14159;
		areaTrapezio = ((a + b) * c) / 2;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

	}

}