package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1118 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {

		/*
		 * Escreva um programa para ler as notas da primeira e a segunda avaliação 
		 * de um aluno. Calcule e imprima a média semestral. O programa só deverá 
		 * aceitar notas válidas (uma nota válida deve pertencer ao intervalo 
		 * [0,10]). Cada nota deve ser validada separadamente.
		 *
		 * No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao 
		 * usuário que informe um código (1 ou 2) indicando se ele deseja ou não executar o 
		 * algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 
		 * 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, 
		 * caso contrário o programa deve ser encerrado.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			double nota1 = scanner.nextDouble();
			
			while(nota1 < 0.0 || nota1 > 10.0) {
				
				System.out.println("nota invalida");
				
				nota1 = scanner.nextDouble();
			}
			
			double nota2 = scanner.nextDouble();
			
			while(nota2 < 0.0 || nota2 > 10.0) {
				
				System.out.println("nota invalida");
				
				nota2 = scanner.nextDouble();
			}
			
			double media = (nota1 + nota2) / 2.0;
			
			System.out.printf("media = %.2f\n", media);
			
			System.out.println("novo calculo (1-sim 2-nao)");
			int novoCalculo = scanner.nextInt();
			
			while(novoCalculo != 1 && novoCalculo != 2) {
				System.out.printf("novo calculo (1-sim 2-nao)\n");
				novoCalculo = scanner.nextInt();
			}
			
			if(novoCalculo == 2) {
				
				break;
			}
			
		}

		scanner.close();
	}

}
