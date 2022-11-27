package iniciante;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro correspondente à idade de uma pessoa em 
		 * dias e informe-a em anos, meses e dias
		 * 
		 * Obs.: apenas para facilitar o cálculo, considere todo ano com
		 * 365 dias e todo mês com 30 dias. Nos casos de teste nunca
		 * haverá uma situação que permite 12 meses e alguns dias, como
		 * 360, 363 ou 364. Este é apenas um exercício com objetivo de
		 * testar raciocínio matemático simples.
		 */
		
		int idadeEmDias, anos, meses, dias;
		
		Scanner sc = new Scanner(System.in);
		
		idadeEmDias = sc.nextInt();
		
		sc.close();
		
		anos = idadeEmDias / 365;
		meses = (idadeEmDias % 365) / 30;
		dias = (idadeEmDias % 365) % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");

	}

}
