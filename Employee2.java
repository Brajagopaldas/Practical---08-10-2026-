class Employee2 {
	int id;
	String name;
	String department;
	double salary;

	public Employee2(int id, String name) {
		this(id, name, "Not Assigned", 0.0);
	}

	public Employee2(int id, String name, String department) {
		this(id, name, department, 0.0);
	}

	public Employee2(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Employee ID   : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Department    : " + department);
		System.out.println("Salary        : Rs. " + salary);
	}

	public static void main(String[] args) {
		Employee2 emp1 = new Employee2(101, "Suresh Mohanty");
		Employee2 emp2 = new Employee2(102, "Pooja Das", "IT");
		Employee2 emp3 = new Employee2(103, "Rajesh Kumar", "QA", 52000.0);

		emp1.display();
		emp2.display();
		emp3.display();
	}
}
