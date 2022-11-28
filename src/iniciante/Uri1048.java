package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1048 {

	public static void main(String[] args) {
	// Link para o exercicio: https://www.beecrowd.com.br/judge/pt/problems/view/1048

		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double salario = scanner.nextDouble();
		
		scanner.close();
		
		double porcentualDeAjuste = 0.0;
		
		if(salario > 0.0 && salario <= 400.0) {
			porcentualDeAjuste = 0.15;
		} else if(salario >= 400.01 && salario <= 800.0) {
			porcentualDeAjuste = 0.12;
		} else if(salario >= 800.01 && salario <= 1200.0) {
			porcentualDeAjuste = 0.1;
		} else if(salario >= 1200.01 && salario <= 2000.0) {
			porcentualDeAjuste = 0.07;
		} else if(salario >= 2000.00) {
			porcentualDeAjuste = 0.04;
		}
		
		double reajusteGanho = salario * porcentualDeAjuste;
		double novoSalario = salario + reajusteGanho;
		
		System.out.printf("Novo salario: %.2f\n"
				+ "Reajuste ganho: %.2f\n"
				+ "Em percentual: %d %%\n",
				novoSalario, reajusteGanho, (int)(porcentualDeAjuste * 100));
	}

}
