package iniciante;

import java.util.Scanner;

public class Uri1019 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro, que é o tempo de duração em 
		 * segundos de um determinado evento em uma fábrica, 
		 * e informe-o expresso no formato horas:minutos:segundos.
		 */
		
		int segundos, horas, minutos; 
		
		Scanner sc = new Scanner(System.in);
		
		segundos = sc.nextInt();
		
		sc.close();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = segundos % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);

	}

}
