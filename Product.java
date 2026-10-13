class Product {
	int productId;
	String productName;
	double price;
	int quantity;

	public Product(int id, String name) {
		productId = id;
		productName = name;
		price = 0.0;
		quantity = 1;
	}

	public Product(int id, String name, double p) {
		productId = id;
		productName = name;
		price = p;
		quantity = 1;
	}

	public Product(int id, String name, double p, int q) {
		productId = id;
		productName = name;
		price = p;
		quantity = q;
	}

	void displayTotal() {
		double total = price * quantity;

		System.out.println("\n-------------------");
		System.out.println("Product ID   : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Price        : Rs. " + price);
		System.out.println("Quantity     : " + quantity);
		System.out.println("Total Amount : Rs. " + total);
	}

	public static void main(String[] args) {
		Product p1 = new Product(101, "Mouse");

		Product p2 = new Product(102, "Keyboard", 1850.0);

		Product p3 = new Product(103, "USB Cable", 299.0, 3);

		p1.displayTotal();
		p2.displayTotal();
		p3.displayTotal();
	}
}
