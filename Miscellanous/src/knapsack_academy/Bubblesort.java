package knapsack_academy;

public class Bubblesort {
	public static void bubbleSort(Item[] list) {
		boolean sorted = false;
		Item temp = new Item(null, 1, 1);
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i].getQuality() > list[i + 1].getQuality()) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}
}