package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1154 {

	public static void main(String[] args) {

		/*
		 * Faça um algoritmo para ler um número indeterminado de dados, 
		 * contendo cada um, a idade de um indivíduo. O último dado, que 
		 * não entrará nos cálculos, contém o valor de idade negativa. 
		 * Calcular e imprimir a idade média deste grupo de indivíduos.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int idade = 0;
		int soma = 0;
		int contador = -1;
		
		
		while(idade >= 0) {
			soma += idade;
			contador += 1;
			
			idade = scanner.nextInt();
		}
		
		scanner.close();
		
		double media = (double)soma / (double)contador;
		
		System.out.printf("%.2f%n", media);

	}

}
