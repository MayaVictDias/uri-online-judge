package iniciante;

import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1115 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma 
		 * quantidade indeterminada de pontos no sistema cartesiano. 
		 * Para cada ponto escrever o quadrante a que ele pertence. 
		 * O algoritmo será encerrado quando pelo menos uma de duas 
		 * coordenadas for NULA (nesta situação sem escrever mensagem 
		 * alguma).
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		while(x != 0 && y != 0) {
			
			if(x > 0 && y > 0) {
				
				System.out.println("primeiro");
				
			} else if(x > 0 && y < 0) {
				
				System.out.println("quarto");
				
			} else if(x < 0 && y < 0) {
				
				System.out.println("terceiro");
				
			} else if(x < 0 && y > 0) {
				
				System.out.println("segundo");
				
			}
			
			x = scanner.nextInt();
			y = scanner.nextInt();
			
		}
		
	}

}
