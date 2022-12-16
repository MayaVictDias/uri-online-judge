package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1041 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		scanner.close();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println("Q1");
			} else if(y < 0){
				System.out.println("Q4");
			} else {
				System.out.println("Eixo X");
			}
		} 
		else if(x < 0) {
			if(y > 0) {
				System.out.println("Q2");
			} else if(y < 0){
				System.out.println("Q3");
			} else {
				System.out.println("Eixo X");
			}
		} 
		else {
			if(y > 0 || y < 0) {
				System.out.println("Eixo Y");
			} else {
				System.out.println("Origem");
			}
		}		
	}
}
