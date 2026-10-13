class Vehicle {
	String vehicleNo;
	String brand;
	String model;
	String fuelType;
	double price;

	public Vehicle(String vehicleNo, String brand) {
		this(vehicleNo, brand, "Standard", "Petrol", 0.0);
	}

	public Vehicle(String vehicleNo, String brand, String model) {
		this(vehicleNo, brand, model, "Petrol", 0.0);
	}

	public Vehicle(String vehicleNo, String brand, String model, String fuelType, double price) {
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
		this.price = price;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Vehicle No : " + vehicleNo);
		System.out.println("Brand      : " + brand);
		System.out.println("Model      : " + model);
		System.out.println("Fuel Type  : " + fuelType);
		System.out.println("Price      : Rs. " + price);
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("OD-02-AB-1234", "Tata");
		Vehicle v2 = new Vehicle("OD-02-XY-4321", "Hyundai", "i20");
		Vehicle v3 = new Vehicle("OD-12-PQ-0001", "Mahindra", "Scorpio", "Diesel", 1750000.0);

		v1.display();
		v2.display();
		v3.display();
	}
}
