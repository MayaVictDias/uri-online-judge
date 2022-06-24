package iniciante;

import java.util.Scanner;

public class uri1018 {

	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro. A seguir, calcule o menor número 
		 * de notas possíveis (cédulas) no qual o valor pode ser 
		 * decomposto. As notas consideradas são de 100, 50, 20, 
		 * 10, 5, 2 e 1. A seguir mostre o valor lido e a relação 
		 * de notas necessárias.
		 */
		
		int valor, notasDe100, notasDe50, notasDe20, notasDe10,
			notasDe5, notasDe2, notasDe1;
		
		Scanner sc = new Scanner(System.in);
		
		valor = sc.nextInt();
		
		sc.close();
		
		System.out.println(valor);
		
		notasDe100 = valor / 100;
		notasDe50 = (valor % 100) / 50;
		notasDe20 = ((valor % 100) % 50) / 20;
		notasDe10 = (((valor % 100) % 50) % 20) / 10;
		notasDe5 = ((((valor % 100) % 50) % 20) % 10) / 5;
		notasDe2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
		notasDe1 = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2);
		
		System.out.println(notasDe100 + " nota(s) de R$ 100,00");
		System.out.println(notasDe50 + " nota(s) de R$ 50,00");
		System.out.println(notasDe20 + " nota(s) de R$ 20,00");
		System.out.println(notasDe10 + " nota(s) de R$ 10,00");
		System.out.println(notasDe5 + " nota(s) de R$ 5,00");
		System.out.println(notasDe2 + " nota(s) de R$ 2,00");
		System.out.println(notasDe1 + " nota(s) de R$ 1,00");

	}

}
