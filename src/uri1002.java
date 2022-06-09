import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class uri1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		/**
		 *  Configuração para que os dados da variavel "raio" possam ser inputados com o
		 * separador de casas decimais ponto (.)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		sc.close();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);

	}

}
