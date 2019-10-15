
package knapsack_academy;

public class knapsack_academy {

	/// * Given a set of items, each with a weight and a value, we must
	/// determine the number of each item to include in a collection so that the
	/// total weight is less than or equal to a given limit and the total value
	/// must be maximized.
	public static void main(String[] args) {

		System.out.println("list non ordinata: ");

		Item[] list = new Item[] { new Item("riso", 40, 3), new Item("fagiolo", 30, 5), new Item("pasta", 20, 2) };

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
		}

		System.out.println("list ordinata: ");

		Bubblesort.bubbleSort(list);

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
		}

		Bucket zaino = new Bucket(8);

		System.out.println("bucket: ");

		Item[] bucket_content = new Item[list.length];

		int index = 0;

		for (Item d : list) {
			int capacity_counter = 0;
			capacity_counter = capacity_counter + d.getWeight(); 
			if (capacity_counter <= zaino.getCapacity()) {
				
				bucket_content[index] = d;
				index++;
			}
		}

		for (int i = 0; i < bucket_content.length; i++) {
			System.out.println(bucket_content[i].getName());
		}
	}



}
