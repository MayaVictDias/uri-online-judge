package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1011 {
	
	/**
	 * @author mayavictdias
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int raio = sc.nextInt();
		
		sc.close();
		
		double volume = ((double)4/3) * 3.14159 * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);
	}

}
