package iniciante;

import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1044 {

	public static void main(String[] args) {
		
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar 
		 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando 
		 * se os valores lidos são múltiplos entre si.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		scanner.close();

		int maiorNumero;
		int menorNumero;
		
		if(a > b) {
			maiorNumero = a;
			menorNumero = b;
		} else {
			maiorNumero = b;
			menorNumero = a;
		}
		
		if(maiorNumero % menorNumero == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

	}

}