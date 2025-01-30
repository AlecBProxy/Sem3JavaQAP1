public class Account {
    //Defining our fields
    private String id;
    private String name;
    private int balance = 0;

    //Creating our constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
    }

    //Creating our getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    //Methods for credit/debit addition and subtraction
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit (int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    //Method for transferring amount from one account to another
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}