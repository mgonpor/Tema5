package tema5;

import java.util.Arrays;

public class Simulacro {

	public static void main(String[] args) {
		int array[] = {1, 8, 3, 1, 6};
		System.out.println(Arrays.toString(array));
		cambiaEnArray(array);
		System.out.println(Arrays.toString(array));
	}

	static void desplazaUnoIzquierda(int array[]) {
		int primero = array[0];
		for(int i=0; i<array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1] = primero;
	}
	
	static int valorMasCercanoInt(int array[], int valor) {
		int masCercano = array[0];
		for(int i=1; i<array.length; i++) {
			if(Math.abs(array[i]-valor) < Math.abs(masCercano-valor)) {
				masCercano = array[i];
			}
		}
		return masCercano;
	}
	
	static void cambiaEnArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				array[i] += 1;
			}
			else {
				array[i] -= 1;
			}
		}
	}
}
