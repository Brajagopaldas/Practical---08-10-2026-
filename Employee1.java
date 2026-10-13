class Employee1 {
	int id;
	String name;
	String department;
	double salary;

	public Employee1(int i, String n) {
		id = i;
		name = n;
		department = "Not Assigned";
		salary = 0.0;
	}

	public Employee1(int i, String n, String d) {
		id = i;
		name = n;
		department = d;
		salary = 0.0;
	}

	public Employee1(int i, String n, String d, double s) {
		id = i;
		name = n;
		department = d;
		salary = s;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Employee ID   : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Department    : " + department);
		System.out.println("Salary        : Rs. " + salary);
	}

	public static void main(String[] args) {

		Employee1 emp1 = new Employee1(101, "Suresh");

		Employee1 emp2 = new Employee1(102, "Pooja", "IT");

		Employee1 emp3 = new Employee1(103, "Rajesh", "IT", 65000.0);

		emp1.display();
		emp2.display();
		emp3.display();
	}
}
