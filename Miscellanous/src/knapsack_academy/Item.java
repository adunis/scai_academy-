package knapsack_academy;

	public final class Item {
		private String name;
		private int value;
		private int weight;
		private double quality;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public Item(String name, int value, int weight) {
			setName(name);
			setValue(value);
			setWeight(weight);
			setQuality(value, weight);
		}

		public double getQuality() {
			return quality;
		}

		public void setQuality(int value, int weight) {
			this.quality = value / weight;
		}
		
	}
	
