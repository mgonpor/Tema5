package tema5;

public class Diapositiva31 {

	public static void main(String[] args) {
		int tabla[] = {2, 7, 7, 15, 45, 89, 1, 13, 46};
		System.out.println(buscar(tabla, 7));
	}

	static int buscar(int t[], int clave) {
		int result = -1;
		int i;
		for(i=0; i<t.length && t[i]!=clave; i++) {
		}
		if(i<t.length) {
			result = i;
		}
		return result;
	}
}
