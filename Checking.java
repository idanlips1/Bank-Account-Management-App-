package bankaccountapp;

import java.util.Random;

public class Checking extends Account {
    // List properties specific to a Checking account
    private long debitCardNumber;
    private int debitCardPin;
    // Constructor to initialize Checking account properties

    public Checking(String name,String sSn,double initDeposit) {
        super(name,sSn,initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }
    @Override
    public void setRate(){
       rate = getBaseRate() * 0.15;
    }

    private void setDebitCard(){
        Random random = new Random();
        debitCardNumber = 100000000000L + (long) (random.nextDouble(900000000000L));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }
    // List any method specific to the Checking account
    public void showInfo(){
        System.out.println("ACCOUNT TYPE: Checking" );
        super.showInfo();
        System.out.println(
            "Your Checking Account Features" + 
            "\nDebit Card Number: " + debitCardNumber + 
            "\nDebit Card Pin: " + debitCardPin + "\n"
        );
    }
}
