class BankAccount {
	long accountNo;
	String holderName;
	double balance;

	public BankAccount(long accNo, String name) {
		accountNo = accNo;
		holderName = name;
		balance = 0.0;
	}
	
	public BankAccount(long accNo, String name, double bal) {
		accountNo = accNo;
		holderName = name;
		balance = bal;
	}

	void display() {
		System.out.println("\n-------------------");
		System.out.println("Account Number : " + accountNo);
		System.out.println("Holder Name    : " + holderName);
		System.out.println("Balance        : Rs. " + balance);
	}

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(98765432101L, "Ram");

		BankAccount acc2 = new BankAccount(98765432102L, "Laxman", 25000.0);

		acc1.display();
		acc2.display();
	}
}
