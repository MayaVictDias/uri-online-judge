package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1117 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia as notas referentes às duas 
		 * avaliações de um aluno. Calcule e imprima a média semestral. 
		 * Faça com que o algoritmo só aceite notas válidas (uma nota 
		 * válida deve pertencer ao intervalo [0,10]). Cada nota deve 
		 * ser validada separadamente.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		nota1 = scanner.nextDouble();
		
		while(nota1 < 0.0 || nota1 > 10.0) {
			
			System.out.println("nota invalida");

			nota1 = scanner.nextDouble();

		}
		
		nota2 = scanner.nextDouble();
		
		while(nota2 < 0.0 || nota2 > 10.0) {
			
			System.out.println("nota invalida");

			nota2 = scanner.nextDouble();

		}
		
		scanner.close();
		
		media = (nota1 + nota2) / 2;
		
		System.out.printf("media = %.2f%n", media);

	}

}
