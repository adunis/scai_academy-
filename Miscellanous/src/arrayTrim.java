
public class arrayTrim {

	public static void main(String[] args) {


		int arrayPreTrimming[] = { 4, 5, 7, 9 };

		boolean arrayTrimmer[] = { true, false, true };

		int arrayPreTrimmingLength = arrayPreTrimming.length;

		boolean[] arrayTrueTrimmer = CreateTrueTrimmer (arrayTrimmer, arrayPreTrimmingLength); 
		// trueTrimmer is as arrayTrimmer but with the length of the array to trim. If arrayTrimmer is smaller than the remainder is 
		// defaulted as TRUE 

		for (int j = 0; j < arrayTrueTrimmer.length; j++) {
			System.out.println(arrayTrueTrimmer[j]); 	
		}
	}

	public static boolean[] CreateTrueTrimmer (boolean[] arrayTrimmer, int arrayPreTrimmingLength){
		
		boolean[] arrayTrueTrimmer = new boolean[arrayPreTrimmingLength]; 
			
		for (int i = 0; i < (arrayTrueTrimmer.length-1) ; i++) {
			if (i>arrayTrimmer.length){
				 arrayTrueTrimmer[i] = true;
			} else { 
				arrayTrueTrimmer[i] = arrayTrimmer[i];
	 }
		}

		
		return arrayTrueTrimmer; 
		
		}

	
	
	
}
