package palindromo;
public class palindromo {

	public static void main(String[] args) {

		String word_dirty = "pa p";
		String word = word_dirty.replaceAll("\\s+", ""); 
			
		
		System.out.println(word);
		
		System.out.println(checkIfPalindroma(word));

	}


public static boolean checkIfPalindroma(String word) {
	int counter = 0; 
	for (int i = 0; i < word.length()/2; i++) {
		if (word.charAt(i)==word.charAt(word.length()-i-1)){
			counter++; 
		}
	}
	
	if (counter == word.length()/2){
		return true; 
	} else {return false;}
}

}
