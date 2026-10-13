class Laptop {
	String brand;
	String processor;
	int ram;
	int storage;
	double price;

	public Laptop(String b, String p) {
		brand = b;
		processor = p;
		ram = 8;
		storage = 256;
		price = 35000.0;
	}

	public Laptop(String b, String p, int r, int s) {
		brand = b;
		processor = p;
		ram = r;
		storage = s;
		price = 55000.0;
	}

	public Laptop(String b, String p, int r, int s, double pr) {
		brand = b;
		processor = p;
		ram = r;
		storage = s;
		price = pr;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Brand     : " + brand);
		System.out.println("Processor : " + processor);
		System.out.println("RAM       : " + ram + " GB");
		System.out.println("Storage   : " + storage + " GB ");
		System.out.println("Price     : Rs. " + price);
	}

	public static void main(String[] args) {
		Laptop lap1 = new Laptop("Acer", "Intel Core i3");
		Laptop lap2 = new Laptop("Asus", "AMD Ryzen 5", 16, 512);
		Laptop lap3 = new Laptop("HP", "Intel Core i7", 32, 1024, 85000.0);

		lap1.display();
		lap2.display();
		lap3.display();
	}
}
