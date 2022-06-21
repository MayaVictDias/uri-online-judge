package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// Ler nome do vendedor
		String nomeVendedor = sc.nextLine();
		// Salario fixo do vendedor
		double salario = sc.nextDouble();
		// Total de vendas efetuadas
		double totalVendasEfetuadas = sc.nextDouble();
		
		sc.close();
		
		// O vendedor recebe 15% de comissão nas vendas efetuadas
		double comissao = totalVendasEfetuadas * 0.15;
		double valorAReceber = salario + comissao;
		
		System.out.printf("TOTAL = R$ %.2f%n", valorAReceber);

	}

}
