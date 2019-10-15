
public class FindPrimeNumbers {

	public static void main(String[] args) {

		for (int i = 1; i < 1001; i++) {
			int counter = 0;
			for (int j = i; j >=1; j--) {
				if (i%j==0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				System.out.println(Integer.toString(i));
			}
		}
	}
}
	