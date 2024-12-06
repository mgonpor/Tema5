package tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Diapositiva21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int longitud = sc.nextInt();
		int tabla[] = new int[longitud];
		
		System.out.printf("Vas a meter %d datos. \n", longitud);
		for(int i=0; i<tabla.length; i++) {
			System.out.printf("Pos %d: ", i);
			tabla[i] = sc.nextInt();
		}
		System.out.println("\n" + Arrays.toString(tabla));
		
		int contPos = 0; int sumPos = 0;
		int contNeg = 0; int sumNeg = 0;
		int contCeros = 0;
		
		for(int e : tabla) {
			if(e>0) {
				sumPos += e;
				contPos++;
			}
			else if(e<0) {
				sumNeg += e;
				contNeg++;
			}
			else {
				contCeros++;
			}
		}
		
		System.out.printf("\nMedia positivos: %.2f", sumPos*1.0/contPos);
		System.out.printf("\nMedia negativos: %.2f", sumNeg*1.0/contNeg);
		System.out.printf("\nCeros: %d", contCeros);
		
		sc.close();
	}

}
