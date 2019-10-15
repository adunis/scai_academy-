
public class Resto {

	public static void main(String[] args) {
		int[] operatori = new int[args.length];
		
		for (int i = 0; i < operatori.length; i++) {
			operatori[i] = Integer.parseInt(args[i]);
		}
		
		int a = operatori[0];
		int b = operatori[1];
		System.out.println(resto(a,b));
		
	}

	private static boolean resto (int a, int b){
		if (a%b==0){
			return true;
		}
		return false;
	}
}
