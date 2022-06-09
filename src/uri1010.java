import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, quantidadePecas1, 
			codigoPeca2, quantidadePecas2;
		
		double valorUnitarioPeca1, valorUnitarioPeca2, valorAPagar;
		
		codigoPeca1 = sc.nextInt();
		quantidadePecas1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		quantidadePecas2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();
		
		sc.close();
		
		valorAPagar = (quantidadePecas1 * valorUnitarioPeca1) 
				+ (quantidadePecas2 * valorUnitarioPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);

	}

}
