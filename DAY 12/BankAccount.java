public abstract class BankAccount {

    int accountNumber;
    String accountHolderName;

    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    abstract void performTransaction();

    void displayAccountInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
    }

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(10245, "Rahul");
        CurrentAccount c = new CurrentAccount(20568, "Priya");

        System.out.println("==BANK ACCOUNT ==");
        s.performTransaction();

        System.out.println();

        System.out.println("== BANK ACCOUNT ==");
        c.performTransaction();
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    void performTransaction() {
        displayAccountInfo();
        System.out.println("Transaction : Savings Account Deposit");
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    void performTransaction() {
        displayAccountInfo();
        System.out.println("Transaction : Current Account Withdrawal");
    }
}