package tema5;

import java.util.Random;
import java.util.Scanner;

public class ActLibroSecreto {

	static void ejer07() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int array[] = new int[100];
		for(int i=0; i<100; i++) {
			array[i] = rand.nextInt(0, 21);
		}
		//Mostrar
		System.out.print("[");
		for(int i=0; i<array.length;i++) {
			if(i==array.length-1) {
				System.out.print(array[i]);
			}
			else {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("]");
		//Pedir dos valores 
		System.out.print("Indique ahora dos números: "
				+ "\n1º: ");
		int n1 = sc.nextInt();
		System.out.print("2º: ");
		int n2 = sc.nextInt();
		//Cambiarlos
		for(int i=0; i<array.length; i++) {
			if(array[i] == n1) {
				array[i] = n2;
			}
		}
		//Mostrar
		System.out.print("[");
		for(int i=0; i<array.length;i++) {
			if(i==array.length-1 && array[i] == n2) {
				System.out.print("'"+array[i]+"'");
			}
			else if(i == array.length-1) {
				System.out.print(array[i]);
			}
			else if(array[i] == n2) {
				System.out.print("'"+array[i]+"' ");
			}
			else {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("]");
		
	}
	
}
