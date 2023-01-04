package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1051 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double salario = scanner.nextDouble();
		
		double baseDeCalculo = 0.0;
		double impostoDeRenda = 0.0;
		
		scanner.close();
		
		if(salario >= 0.0 && salario <= 2000.00) {
			 
			
			
		} else if(salario >= 2000.01 && salario <= 3000.00) {
			
			
			
		} else if(salario >= 3000.01 && salario <= 4500.00) {
			
			
			
		} else if(salario >= 4500.00) {
			
			
			
		}
		
		if(impostoDeRenda != 0) {
			
			System.out.printf("R$ %.2f", impostoDeRenda);
			
		} else {
			
			System.out.println("Isento");
			
		}
		
	}

}
