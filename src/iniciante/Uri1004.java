package iniciante;
import java.util.Scanner;

/**
 * @author mayavictdias
 *
 */
public class Uri1004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int produto = a * b;
		
		sc.close();
		
		System.out.println("PROD = " + produto);
		
	}

}
