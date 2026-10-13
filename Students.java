class Student {
	int rollNo;
	String name;
	double marks;

	public Student() {
		rollNo = 101;
		name = "Amit";
		marks = 85.5;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Name        : " + name);
		System.out.println("Marks       : " + marks);
	}

	public static void main(String[] args) {
		Student obj = new Student();

		obj.display();
	}
}
