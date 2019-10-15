
public class MassimoDaArray {

	public static void main(String[] args) {
	
		int[] array = new int[(int) getRandomArbitrary(1,50)]; 
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) getRandomArbitrary(1,1000); 
		}

		System.out.println("Maximum array is:"); 
		System.out.println(max_of_array(array)); 
		
		System.out.println("Array List:"); 
		for (int i = 0; i < array.length; i++) {
			System.out.format("[%d]:%d%n",i,array[i]); 
		}
	}

	public static int max_of_array(int array[]){
		
		int maximum = 0; 
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]>maximum){
				maximum = array[i]; 
			}
		}
		return maximum; 
		
	}
	
	
	private static double getRandomArbitrary(int min, int max) {
		  return Math.random() * (max - min) + min;
		}
	
}
