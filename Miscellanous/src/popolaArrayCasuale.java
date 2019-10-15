import java.util.Arrays;

public class popolaArrayCasuale {

	//Somma tra i due array 
	
	public static void main(String[] args) {
		
	
	int[] array_uno = new int[(int) getRandomArbitrary(1,10)];
	int[] array_due = new int[(int) getRandomArbitrary(1,10)];
	
	
	array_uno= popolaArrayCasuale(array_uno); 
	array_due= popolaArrayCasuale(array_due); 
	
	int[]maggiore = array_uno.length>array_due.length?array_uno:array_due;
	int[]minore = array_uno.length<array_due.length?array_uno:array_due;
	
	int[]array_somma = new int[maggiore.length]; 
	
	for (int i = 0; i <minore.length; i++) {
		array_somma[i] = minore[i] + maggiore[i]; 
	}
	
	for (int i = minore.length; i <maggiore.length; i++) {
		array_somma[i] = maggiore[i]; 
	}
	
	
	System.out.println("Array Uno:"); 
	System.out.println(Arrays.toString(array_uno));
	
	System.out.println("Array Due:"); 
	System.out.println(Arrays.toString(array_due));
	
	System.out.println("Array Somma:"); 
	System.out.println(Arrays.toString(array_somma));
	
  }


	private static double getRandomArbitrary(int min, int max) {
		  return Math.random() * (max - min) + min;
		}


	private static int[] popolaArrayCasuale(int[] array){
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) getRandomArbitrary(1,1000); 
		}
		return array;
	}
	
	
	
	
}

