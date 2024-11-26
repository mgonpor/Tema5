package tema5;

import java.util.Random;

public class Diapositiva20 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int diezNum[] = new int[10];
		
		for(int i=0; i<diezNum.length; i++) {
			diezNum[i] = rand.nextInt(1, 101); 
		}

		int sumaElementos = 0;
		
		for(int e : diezNum) {
//			System.out.println(e);
			sumaElementos += e;
		}

		System.out.println("La suma da " + sumaElementos);
	}

}
