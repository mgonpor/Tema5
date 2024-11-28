package tema5;

public class Diapositiva35 {

	public static void main(String[] args) {
		int miBoleto[] = {1, 2, 3, 4, 5, 6};
		int boletoGanador[] = {6, 2, 2, 4, 2, 1};
		System.out.println(compruebaPrimitiva(miBoleto, boletoGanador));
	}

	static int compruebaPrimitiva(int boleto[], int combinacionGanadora[]) {
		if(boleto.length == 6 && combinacionGanadora.length == 6) {
			int contAciertos = 0;
			for(int i=0; i<6; i++) {
				if(boleto[i] == combinacionGanadora[i]) {
					contAciertos++;
				}
			}
			return contAciertos;
		}
		else {
			throw new IllegalArgumentException("El boleto no tiene 6 números");
		}
	}
}
