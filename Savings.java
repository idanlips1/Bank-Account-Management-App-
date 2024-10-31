package bankaccountapp;

import java.util.Random;

public class Savings extends Account {
    // List properties specific to Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize settings for saving account
    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any Methods specific to Savings account
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\nSaftey Deposit Box ID: " + safetyDepositBoxID +
                        "\nSaftey Deposit Box Key: " + safetyDepositBoxKey + "\n"
                        );

    }

}
