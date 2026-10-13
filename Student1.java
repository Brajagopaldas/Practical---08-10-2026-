class Student1 {
	int rollNo;
	String name;
	String course;
	double marks;

	public Student1(int r, String n) {
		rollNo = r;
		name = n;
		course = "Not Assigned";
		marks = 0.0;
	}

	public Student1(int r, String n, String c) {
		rollNo = r;
		name = n;
		course = c;
		marks = 0.0;
	}

	public Student1(int r, String n, String c, double m) {
		rollNo = r;
		name = n;
		course = c;
		marks = m;
	}

	void display() {
		System.out.println("RollNo : "+rollNo + " " +" , Name : " +  name + " " + " , Course : " + course + " " + " , Marks : " + marks);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "Ram");
		Student1 s2 = new Student1(102, "Laxman", "Electrical");
		Student1 s3 = new Student1(103, "Sita", "Computer Science", 95.0);

		s1.display();
		s2.display();
		s3.display();
	}
}
