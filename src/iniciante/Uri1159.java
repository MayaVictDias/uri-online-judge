package iniciante;

import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1159 {

	public static void main(String[] args) {
		
		/*
		 * O programa deve ler um valor inteiro X indefinidas 
		 * vezes. (O programa irá parar quando o valor de X for 
		 * igual a 0). Para cada X lido, imprima a soma dos 5 
		 * pares consecutivos a partir de X, inclusive o X , se 
		 * for par. Se o valor de entrada for 4, por exemplo, a 
		 * saída deve ser 40, que é o resultado da operação: 
		 * 4+6+8+10+12, enquanto que se o valor de entrada for 11, 
		 * por exempo, a saída deve ser 80, que é a soma de 
		 * 12+14+16+18+20.
		 */

		Scanner scanner = new Scanner(System.in);
		
		int x = 1;
		int soma = 0;
		int numero = 0;
		int somador = x;
		
		x = scanner.nextInt();
		
		while (x != 0) {
			
			if(x % 2 == 0) {
				numero = x;
				soma = x;
			} else {
				numero = x + 1;
				soma = x + 1;
			}
			
			
			for(int i = 0; i < 4; i++) {
				somador = numero + 2;
				soma += somador;
				numero = somador;
			}
			
			System.out.println(soma);
			
			x = scanner.nextInt();
		}
		
		scanner.close();

	}

}
