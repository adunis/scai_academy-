import java.util.Arrays;

public class CesarCypher {

	public static void main(String[] args) {

		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char[] messaggio = "ABCXYZ".toCharArray();
		int key = 99999;
		
		System.out.println(Arrays.toString(cifratore(messaggio, alphabet, key)));
	}
	
	public static char[] cifratore (char[] messaggio, char[] alphabet, int key){
		
		if (key > alphabet.length){
			key = (key % alphabet.length); 
		}
		
		char[] risultato = new char[messaggio.length];
		
		for (int i = 0; i < messaggio.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (messaggio[i] == alphabet[j]) {
					if ((j) >= (alphabet.length - key)) {
						risultato[i] = alphabet[j + key - alphabet.length];
					} else {
						risultato[i] = alphabet[j + key];
					}
				}
			}
		}
		
		return risultato; 
	}
}
