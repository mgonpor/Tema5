package tema5;

import java.util.Arrays;

public class Diapositiva13 {

	public static void main(String[] args) {

		int iArray[] = {1, 2, 3, 4, 5};
		double dArray[] = new double[5];
		boolean bArray[] = new boolean[5];

		System.out.println(iArray);
		System.out.println(dArray);
		System.out.println(bArray);
	
		String s = Arrays.toString(bArray);
		System.out.println(s);
		
		System.out.println("Tamaño del array: " + iArray.length);
	}

}
