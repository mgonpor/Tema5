package tema5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ActLibroSecreto {
	
	public static void main(String[] args) {
		ejer14();
	}

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
		sc.close();
	}
	
	//Ayuda
	static boolean esPrimo(int n) {
		boolean result = true;
		for(int i = 2; i <= Math.sqrt(n) && result; i++) {
			if(n%i == 0) {
				result = false;
			}
		}
		return result;
	}
	
	static void muestraArrayConIndicies(int array[]) {
		for(int i=0; i<10; i++) {
			if(array[i]/10>0) {
				System.out.printf(" %d  ", i);
			}
			else {
				System.out.printf(" %d ", i);
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(array));
	}
	static void ejer11() {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		System.out.println("Mete 10 números: ");
		for(int i=0; i<10; i++) {
			array[i] = sc.nextInt();
		}
		//Muestra
		muestraArrayConIndicies(array);
		//Cambia
		int arrayNuevo[] = Arrays.copyOf(array, array.length);
		int ij=0;
		int j=array.length-1;
		for(int elem : arrayNuevo) {
			if(esPrimo(elem)) {
				array[ij] = elem;
				ij++;
			}else {
				array[j] = elem;
				j--;
			}
		}
		//Muestra
		muestraArrayConIndicies(array);
		sc.close();
	}
	
	static void ejer14(){
		String arrayColores[] = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		Arrays.sort(arrayColores);
		Scanner sc = new Scanner(System.in);
		String array[] = new String[8];
		System.out.println("Introduce palabras: ");
		for(int i=0; i<array.length; i++) {
			array[i] = sc.next();
		}
		sc.close();
		String arrayNuevo[] = Arrays.copyOf(array, array.length);
		int i=0;
		int j=array.length-1;
		for(String elem : arrayNuevo) {
			if(Arrays.binarySearch(arrayColores, elem) > -1) {
				array[i] = elem;
				i++;
			}
			else {
				array[j] = elem;
				j--;
			}
		}
		//Muestra
		System.out.println(Arrays.toString(array));
	}
	
}
