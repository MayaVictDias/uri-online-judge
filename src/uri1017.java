import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto = sc.nextInt();
		int velocidadeMediaQuilometrosHora = sc.nextInt();
		
		sc.close();
		
		// O carro faz 12km/l
		double quantidadeLitros = ((double)tempoGasto * (double)velocidadeMediaQuilometrosHora) / 12;
		
		System.out.printf("%.3f%n", quantidadeLitros);

	}

}
