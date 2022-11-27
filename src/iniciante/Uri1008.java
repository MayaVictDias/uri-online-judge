package iniciante;
import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt(); // Número (ID) do funcionário
		int horasTrabalhadas = sc.nextInt(); // Valor do numero de horas trabalhadas pelo funcionario
		double valorHora = sc.nextDouble(); // Valor da hora de trabalho do funcionario
		
		sc.close();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numeroFuncionario, salario);

	}

}
