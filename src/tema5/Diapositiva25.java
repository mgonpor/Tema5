package tema5;

import java.util.Arrays;
import java.util.Random;

public class Diapositiva25 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(rellenaPares(5,10)));
	}

	static int[] rellenaPares(int longitud, int fin) {
		Random rand = new Random();
		int lista[] = new int[longitud];
		for(int i=0; i<longitud; i++) {
			lista[i] = 2*rand.nextInt(1,(fin/2)+1);
		}
		Arrays.sort(lista);
		return lista;
	}
}
