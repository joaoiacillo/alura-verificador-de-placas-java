package verificador;

public class Main {

	public static void verificarPlacas() {
		String[] placas = {
				"PLACA-INVALIDA-123", // false
				"FPL-876", // false
				"FPL-8768", // true
				"FPL==0010", // true
				"ALGUM NOME ALEATÓRIO", // false
				"SABESE LÁ O QUE", // false
				"1271343894", // false
				"&**#@$%@@%@#%@", // false
				"ASD--¨%$¨#@!$@##%@%85*%&*%¨&%94" // true
		};
		
		for (String placa : placas) {
			System.out.println(placa + ": " + VerificadorDePlaca.verify(placa));
		}
	}
	
	public static void main(String[] args) {
		verificarPlacas();
		
	}

}
