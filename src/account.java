 class Account {
    private double balance;

    // No-argument constructor: default balance = 0
    public Account() {
        this.balance = 0.0;
    }

    // Parameterized constructor: initialize with given balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using no-argument constructor
        Account acc1 = new Account();
        acc1.displayBalance();
        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc1.displayBalance();

        System.out.println("--------------------------");

        // Using parameterized constructor
        Account acc2 = new Account(10000);
        acc2.displayBalance();
        acc2.deposit(3000);
        acc2.withdraw(12000);
        acc2.displayBalance();
    }
}

