class Employee {
	int empId;
	String name;
	double salary;

	public Employee() {
		empId = 1000;
		name = "Not Assigned";
		salary = 0.0;
	}
	public Employee(int id, String n, double s) {
		empId = id;
		name = n;
		salary = s;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Employee ID   : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Salary        : Rs. " + salary);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(1001, "Rahul Sharma", 45000.0);
		
		emp1.display();
		emp2.display();
	}
}
