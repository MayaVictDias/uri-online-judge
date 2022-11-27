package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	/**
	 * @author mayavictdias
	 * 
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double cachorroQuente = 4.0; // codigo 1
		double xSalada = 4.5; // codigo 2
		double xBacon = 5.0; // codigo 3
		double torradaSimples = 2.0; // codigo 4
		double refrigerante = 1.5; // codigo 5
		
		Scanner scanner = new Scanner(System.in);
		
		int codigoProduto = scanner.nextInt();
		int quantidade = scanner.nextInt();
		
		scanner.close();
		
		double valorTotal = 0.0;
		
		switch (codigoProduto) {
			case 1:
				valorTotal = quantidade * cachorroQuente;
				break;
			case 2:
				valorTotal = quantidade * xSalada;
				break;
			case 3:
				valorTotal = quantidade * xBacon;
				break;
			case 4:
				valorTotal = quantidade * torradaSimples;
				break;
			case 5:
				valorTotal = quantidade * refrigerante;
				break;
		}
		
		System.out.printf("Total: R$ %.2f\n", valorTotal);
	}
}