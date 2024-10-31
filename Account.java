package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for checking and savings account
    private String name;
    private String sSN;
    private double balance;

    private static int index = 10000;
    protected double rate;
    protected String accountNumber;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        // Set Account number
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index++;
        int randomThreeDigitNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomThreeDigitNumber;
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        prinBalance();
    }

    // List common methods - transactions
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("$" + amount + " has been added to your account");
        prinBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("$" + amount + " has been withdrawed from your account");
        prinBalance();
    }

    public void transfer(double amount, String toWhere) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        prinBalance();
    }

    public void prinBalance() {
        System.out.println("Your Balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println("NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%");
    }
}
