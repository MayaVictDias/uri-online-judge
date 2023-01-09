package iniciante;

import java.util.Scanner;

public class Uri1113 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {

		/*
		 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. 
		 * Escreva para cada X e Y uma mensagem que indique se estes valores foram 
		 * digitados em ordem crescente ou decrescente.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		while(x != y) {
			if(x < y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			x = scanner.nextInt();
			y = scanner.nextInt();
		}
		
		scanner.close();

	}

}
