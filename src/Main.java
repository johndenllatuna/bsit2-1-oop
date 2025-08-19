public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%\n");

        BankAccount acc1 = new BankAccount("John Den", 1200);
        BankAccount acc2 = new BankAccount("Jose Manuel", 2300);
        BankAccount acc3 = new BankAccount("Ashton Lactuan", 1500);

        System.out.println("\n═══ Account Operations ═══");
        acc1.deposit(500);
        acc2.withdraw(300);

        System.out.println("\n═══ Interest Calculation ═══");
        System.out.println("John Den's interest: $" + acc1.calculateInterest());
        System.out.println("Jose Manuel's interest: $" + acc2.calculateInterest());
        System.out.println("Ashton Lactuan's interest: $" + acc3.calculateInterest());

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}