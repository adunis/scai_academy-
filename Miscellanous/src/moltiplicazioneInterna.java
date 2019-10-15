import java.util.Arrays;

public class moltiplicazioneInterna {

	public static void main(String[] args) {

		/*
		 * 
		 * (4,8,9) => [36] (4,8,9,2) => [8,72]
		 * 
		 * 
		 */

		int[] test = new int[] { 4, 8, 5, 9, 2 };

		System.out.println("Original Array : size : " + test.length);
		System.out.println("Contents : " + Arrays.toString(test));

		int[] arrayToSplit = new int[test.length / 2];

		if (checkIfOdd(test)) {
			arrayToSplit = removeElement(test, findMiddleIndex(test));
		}

		System.out.println("Array to Split : size : " + arrayToSplit.length);
		System.out.println("Contents : " + Arrays.toString(arrayToSplit));

		int[] firstHalf = splitArrayInHalf(arrayToSplit)[0];
		int[] secondHalf = splitArrayInHalf(arrayToSplit)[1];

		System.out.println("First Half Array : size :" + firstHalf.length);
		System.out.println("Contents : " + Arrays.toString(firstHalf));

		System.out.println("Second Half Array : size :" + secondHalf.length);
		System.out.println("Contents : " + Arrays.toString(secondHalf));

		int[] multipliedArray = new int[firstHalf.length + secondHalf.length];

		multipliedArray = moltiplicaInterno(firstHalf, secondHalf);

		System.out.println("Multiplied Array : size :" + multipliedArray.length);
		System.out.println("Contents : " + Arrays.toString(multipliedArray));

	}

	static boolean checkIfOdd(int[] input) {
		if (input.length % 2 != 0) {
			return true;
		}
		return false;
	}

	static int findMiddleIndex(int[] input) {
		return ((input.length - 1) / 2);

	}

	static int[] removeElement(int[] arr, int index) {

		int[] newArr = new int[arr.length - 1];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				newArr[j] = arr[i];
				j++;
			}

		}
		return newArr;
	}

	static int[][] splitArrayInHalf(int[] array) {

		int[] firstHalf = new int[array.length / 2];
		int[] secondHalf = new int[array.length / 2];

		int[][] splittedArray = new int[2][array.length / 2];

		for (int i = 0; i < array.length / 2; i++) {
			firstHalf[i] = array[i];
		}

		for (int i = 0; i < array.length / 2; i++) {
			secondHalf[i] = array[i + array.length / 2];
		}

		splittedArray[0] = firstHalf;
		splittedArray[1] = secondHalf;

		return splittedArray;

	}

	static int[] moltiplicaInterno(int[] primo, int[] secondo) {

		int[] risultato = new int[primo.length];

		for (int i = 0; i < primo.length; i++) {
			risultato[i] = primo[i] * secondo[primo.length - i - 1];
		}

		return risultato;
	}

}