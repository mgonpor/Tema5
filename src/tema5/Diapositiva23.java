package tema5;

public class Diapositiva23 {

	public static void main(String[] args) {

		int array[] = {1, 2, 6, 4, 5};
		
		System.out.println(maximo(array));
		
	}

	static int maximo(int t[]) {
		int result = 0;
		for(int valor : t) {
			if(valor > result) {
				result = valor;
			}
		}
		return result;
	}
}
