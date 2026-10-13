class Book {
	int bookId;
	String title;
	String author;

	public Book(int id, String t, String a) {
		bookId = id;
		title = t;
		author = a;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Book ID : " + bookId);
		System.out.println("Title   : " + title);
		System.out.println("Author  : " + author);
	}

	public static void main(String[] args) {
		Book b1 = new Book(101, "abc", "Xys");
		b1.display();
	}
}
