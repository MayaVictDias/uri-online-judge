package iniciante;

import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1134 {

	public static void main(String[] args) {

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus 
		 * produtos tem a preferência de seus clientes. Escreva um 
		 * algoritmo para ler o tipo de combustível abastecido (codificado 
		 * da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o 
		 * usuário informe um código inválido (fora da faixa de 1 a 4) deve 
		 * ser solicitado um novo código (até que seja válido). O programa 
		 * será encerrado quando o código informado for o número 4.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int numero = 0;
		
		while(numero != 4) {
			
			numero = scanner.nextInt();
			
			if(numero == 1) {
				alcool += 1;
			} else if(numero == 2) {
				gasolina += 1;
			} else if(numero == 3) {
				diesel += 1;
			}
		}
		
		System.out.printf("MUITO OBRIGADO\n"
				+ "Alcool: %d\n"
				+ "Gasolina: %d\n"
				+ "Diesel: %d%n",
				alcool, gasolina, diesel);
		
		
		scanner.close();

	}

}
