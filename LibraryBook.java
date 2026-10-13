class LibraryBook {
	int bookId;
	String title;
	String author;
	boolean available;

	public LibraryBook(int bookId, String title) {
		this(bookId, title, "Unknown", true);
	}

	public LibraryBook(int bookId, String title, String author) {
		this(bookId, title, author, true);
	}

	public LibraryBook(int bookId, String title, String author, boolean available) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.available = available;
	}

	void issueBook() {
		if (available) {
			available = false;
			System.out.println("Book issued successfully: " + title);
		} else {
			System.out.println("Sorry, '" + title + "' is already issued.");
		}
	}

	void returnBook() {
		if (!available) {
			available = true;
			System.out.println("Book returned successfully: " + title);
		} else {
			System.out.println("'" + title + "' was not issued.");
		}
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Book ID    : " + bookId);
		System.out.println("Title      : " + title);
		System.out.println("Author     : " + author);
		System.out.println("Available  : " + (available ? "Yes" : "No"));
	}

	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook(101, "Math");
		LibraryBook b2 = new LibraryBook(102, "Science", "NCERT");
		LibraryBook b3 = new LibraryBook(103, "History", "NCERT", false);

		b1.display();
		b2.display();
		b3.display();

		System.out.println("\n--- Transactions ---");
		b1.issueBook();
		b1.issueBook();
		b1.returnBook();

		b1.display();
	}
}
