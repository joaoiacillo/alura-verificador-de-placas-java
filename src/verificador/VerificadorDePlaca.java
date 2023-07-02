package verificador;

public class VerificadorDePlaca {

	public static boolean verify(String placa) {
		placa = placa.replaceAll("[^A-Za-z0-9]", "");
		
		if (placa.length() != 7) return false;
		if (!placa.substring(0, 3).matches("[a-zA-Z]*")) return false;
		
		return placa.substring(3).matches("[0-9]*");
	}
	
}
