package iniciante;

import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1046 {

	public static void main(String[] args) {
		
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir
		 * calcule a duração do jogo, sabendo que o mesmo pode começar
		 * em um dia e terminar em outro, tendo uma duração mínima
		 * de 1 hora e máxima de 24 horas.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int horarioInicial = scanner.nextInt();
		int horarioFinal = scanner.nextInt();
		
		scanner.close();
		
		int duracaoDoJogo;
		
		if(horarioInicial >= horarioFinal) {
			duracaoDoJogo = (24 - horarioInicial) + horarioFinal;
		} else {
			duracaoDoJogo = horarioFinal - horarioInicial;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n", duracaoDoJogo);

	}

}
