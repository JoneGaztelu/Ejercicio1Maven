package ed20_jUnit03_CadenaMaven;

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		int cnt=0;
		for(int i = 0; i < cadena.length(); i++) {
			if ((cadena.charAt(i)=='a')|| (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public String invertir(String cadena) {
		String cadenaInvertida="";
		for (int i = cadena.length()-1; i >=0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		return cadenaInvertida;
	}
	
	public int contarLetra(String cadena, char caracter) {
		int posicion;
		int cnt = 0;
		posicion = cadena.indexOf(caracter);
		while (posicion != -1) {
            cnt++;     
            posicion = cadena.indexOf(caracter, posicion + 1);
		}
		return cnt;
	}
	
}
