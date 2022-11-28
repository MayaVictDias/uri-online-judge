package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1037 {

	/*
	 * Você deve fazer um programa que leia um valor qualquer e 
	 * apresente uma mensagem dizendo em qual dos seguintes intervalos 
	 * ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
	 * Obviamente se o valor não estiver em nenhum destes intervalos, 
	 * deverá ser impressa a mensagem “Fora de intervalo”.
	 *
	 * O símbolo ( representa "maior que". Por exemplo:
	 * [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
	 * (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 
	 * 50.0000000
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double numero = scanner.nextDouble();
		
		scanner.close();
		
		if(numero >= 0.0 && numero <= 25.0) {
			System.out.println("Intervalo (0,25]");
		} else if(numero > 25.0 && numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if(numero > 50.0 && numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else if(numero > 75.0 && numero <= 100.0) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		
	}

}
