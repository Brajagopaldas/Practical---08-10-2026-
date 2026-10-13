class Rectangle {
	double length;
	double breadth;

	public Rectangle(double l, double b) {
		length = l;
		breadth = b;
	}

	void calculateArea() {
		double area = length * breadth;
		System.out.println("Area of Rectangle      : " + area);
	}

	void calculatePerimeter() {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle : " + perimeter);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(14.0, 7.5);

		System.out.println("-------------------");
		r.calculateArea();
		r.calculatePerimeter();
	}
}
