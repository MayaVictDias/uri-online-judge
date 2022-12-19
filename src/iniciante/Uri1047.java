package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1047 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int horaInicial = scanner.nextInt();
		int minutoInicial = scanner.nextInt();
		int horaFinal = scanner.nextInt();
		int minutoFinal = scanner.nextInt();
			
		int horas = 0;
		int minutos = 0;
		
		scanner.close();

		int qtnMinIniciais = (horaInicial * 60) + minutoInicial;
		int qtnMinFinais =  (horaFinal * 60) + minutoFinal;
		
		int duracao;
		if (qtnMinIniciais < qtnMinFinais) {
			duracao = qtnMinFinais - qtnMinIniciais;
		}
		else {
			duracao = (24 * 60 - qtnMinIniciais) + qtnMinFinais;
		}
			
		horas = duracao / 60;
		minutos = duracao % 60;
		
		if(horas == 0 && minutos == 0) {
			horas = 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",
				 horas, minutos);
		
	}

}
