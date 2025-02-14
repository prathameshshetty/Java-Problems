class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!!");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public static final double WITHDRAW_LIMIT = 650; // Fixed naming convention

    public SavingsAccount(double amount) {
        super(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAW_LIMIT) {
            System.out.println("Withdraw limit exceeded!");
        } else if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class CheckingAccount extends BankAccount {
    public static final double OVERDRAFT_FEE = 100;

    public CheckingAccount(double amount) {
        super(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            balance -= (amount + OVERDRAFT_FEE);
        } else {
            balance -= amount;
        }
    }
}

public class prg10 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);
        CheckingAccount checking = new CheckingAccount(1000);

        savings.withdraw(300);
        checking.withdraw(250);

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
