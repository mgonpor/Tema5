package tema5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FuncionesArrays {

	static int[] generaArrayInt(int n, int min, int max) {
		Random rand = new Random();
		int arrayInt[] = new int[n];
		for(int i=0; i<n; i++) {
			arrayInt[i] = rand.nextInt(min, max+1);
		}
		return arrayInt;
	}
	
	static int minimoArrayInt(int[] arrayInt) {
		int minimo = arrayInt[0];
		for(int valores : arrayInt) {
			if(valores<minimo) {
				minimo = valores;
			}
		}
		return minimo;
		
//		Otra forma:
//		Arrays.sort(arrayInt);
//		return arrayInt[0];
	}
	
	static int maximoArrayInt(int[] arrayInt) {
		int maximo = arrayInt[0];
		for(int valores : arrayInt) {
			if(valores>maximo) {
				maximo = valores;
			}
		}
		return maximo;
		
//		Otra forma:
//		Arrays.sort(arrayInt);
//		return arrayInt[arrayInt.length-1];
	}
	
	static double mediaArrayInt(int[] arrayInt) {
		double media = 0;
		for(int valores : arrayInt) {
			media += valores;
		}
		media /= arrayInt.length*1.0;
		return media;
	}
	
	static boolean estaEnArrayInt(int numero, int[] arrayInt) {
		boolean result = false;
		for(int i=0; i<arrayInt.length && !result; i++) {
			if(arrayInt[i] == numero) {
				result = true;
			}
		}
		return result;
	}
	
	static int posicionEnArray(int n, int[] arrayInt) {
		int posicion = -1;
		for(int i=0; i<arrayInt.length && posicion==-1; i++) {
			if(n == arrayInt[i]) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	static int[] volteaArrayInt(int[] arrayInt) {
		int arrayIntVolteado[] = new int[arrayInt.length];
		int posVolteado = 0;
		for(int i=arrayInt.length-1; i>=0; i--) {
			arrayIntVolteado[posVolteado] = arrayInt[i];
			posVolteado++;
		}
		return arrayIntVolteado;
	}
	
	static int[] desplazaDerechaConModulo(int n, int[] arrayInt) {
		int len = arrayInt.length;
		int arrayDesplazado[] = new int[len];
		for(int i=0; i<len; i++) {
			arrayDesplazado[(i+n)%len] = arrayInt[i];
		}
		return arrayDesplazado;
	}
	
	static int[] desplazaUnoDerecha(int[] arrayInt) {
		int aux = arrayInt[arrayInt.length-1];
		for(int i=arrayInt.length-1; i>0; i--) {
			arrayInt[i] = arrayInt[i-1];
		}
		arrayInt[0] = aux;
		return arrayInt;
	}
	
	static int[] desplazaDerechaArrayInt(int n, int[] arrayInt) {
		for(int i=0; i<n; i++) {
			arrayInt = desplazaUnoDerecha(arrayInt);
		}
		return arrayInt;
	}
	
	static int[] desplazaUnoIzquierda(int[] arrayInt) {
		int aux = arrayInt[0];
		for(int i=0; i<arrayInt.length-1; i++) {
			arrayInt[i] = arrayInt[i+1];
		}
		arrayInt[arrayInt.length-1] = aux;
		return arrayInt;
	}
	
	static int[] desplazaIzquierdaArrayInt(int n, int[] arrayInt) {
		for(int i=0; i<n; i++) {
			arrayInt = desplazaUnoIzquierda(arrayInt);
		}
		return arrayInt;
	}
	
	static int[] desplazaDerechaArrayIntRec(int n, int[] arrayInt) {
		if(n==1) {
			int aux = arrayInt[arrayInt.length-1];
			for(int i=arrayInt.length-1; i>0; i--) {
				arrayInt[i] = arrayInt[i-1];
			}
			arrayInt[0] = aux;
			return arrayInt;
		}
		return desplazaDerechaArrayIntRec(n-1, desplazaDerechaArrayIntRec(1, arrayInt));
	}
	
//	----------
//	Actividades Moodle
//	----------
	
	static int[] funcion12() {
		Random rand = new Random();
		int array[] = generaArrayInt(20, 0, 100);
		System.out.println(Arrays.toString(array));
		int arrayNuevo[] = Arrays.copyOf(array, array.length);
		int i=0;
		int j=array.length-1;
		for(int elem : arrayNuevo) {
			if(elem%2==0) {
				array[i] = elem;
				i++;
			}
			else {
				array[j] = elem;
				j--;
			}
		}
		return array;
	}
	
	static void funcion13() {
		Scanner sc = new Scanner(System.in);
		int tempMes[] = new int[12];
		for(int i=0; i<12; i++) {
			System.out.printf("Temperatura mes %d: ", i+1);
			tempMes[i] = sc.nextInt();
		}
		System.out.println();
		for(int i=0; i<12; i++) {
			System.out.printf("%02d: ", i+1);
			for(int j=0; j<tempMes[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void funcion14() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int array[] = new int[100];
		int maximo = 0;
		int minimo = 500;
		for(int i=0; i<100; i++) {
			array[i] = rand.nextInt(0, 501);
			if(array[i]<minimo) {
				minimo = array[i];
			}
			else if(array[i]>maximo) {
				maximo = array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		
		String respuesta = "";
		do {
			System.out.println("¿Quiere destacar el maximo o el minimo? (M, m)");
			respuesta = sc.next();
		}while(!respuesta.equals("M") && !respuesta.equals("m"));
		
		if(respuesta.equals("M")) {
			System.out.print("[");
			for(int i=0; i<array.length;i++) {
				if(i == array.length-1 && array[i]==maximo) {
					System.out.print("**"+array[i]+"**");
				}
				else if(i == array.length-1) {
					System.out.print(array[i]);
				}
				else if(array[i]==maximo) {
					System.out.print("**"+array[i]+"**,");
				}
				else {
					System.out.print(array[i] + ", ");
				}
			}
			System.out.println("]");
		}
		else {
			System.out.print("[");
			for(int i=0; i<array.length;i++) {
				if(i == array.length-1 && array[i]==minimo) {
					System.out.print("**"+array[i]+"**");
				}
				else if(i == array.length-1) {
					System.out.print(array[i]);
				}
				else if(array[i]==minimo) {
					System.out.print("**"+array[i]+"**,");
				}
				else {
					System.out.print(array[i] + ", ");
				}
			}
			System.out.println("]");
		}
		
	}
	
}
