class Mobile {
	String brand;
	String model;
	double price;

	public Mobile(String b, String m, double p) {
		brand = b;
		model = m;
		price = p;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : Rs. " + price);
	}

	public static void main(String[] args) {

		Mobile m1 = new Mobile("Samsung", "Galaxy S24", 79999.0);
		Mobile m2 = new Mobile("Apple", "iPhone 16", 89999.0);
		Mobile m3 = new Mobile("OnePlus", "12", 64999.0);
		
		m1.display();
		m2.display();
		m3.display();
	}
}
