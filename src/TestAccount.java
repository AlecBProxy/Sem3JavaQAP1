public class TestAccount {
    public static void main(String[] args) {
        //Creation of two accounts
        Account acc1 = new Account("Account-001", "Jalen Green", 5000);
        Account acc2 = new Account("Account-002", "Alperen Sengun", 4000);

        //Displaying the initial balance of the two accounts
        System.out.println("Balance of Account-001: " + acc1.getBalance());
        System.out.println("Balance of Account-002 " + acc2.getBalance());

        //Complete a transfer action by sending $1000 to the second account
        acc1.transferTo(acc2, 1000);

        //Displaying the new balances, post-transfer
        System.out.println("Balance of Account #1 after transfer: $" + acc1.getBalance());
        System.out.println("Balance of Account #2 after transfer: $" + acc2.getBalance());
    }
}
