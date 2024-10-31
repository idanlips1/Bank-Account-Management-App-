package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List <Account> accounts = new LinkedList<Account>();

        String file = "/Users/idanlipschitz/Downloads/NewBankAccounts.csv";
        /*
         * Checking checkacc1 = new Checking("Idan Lipschitz","322657271",1500);
         * Savings savingsacc2 = new Savings("Ella Jacobi","211328661",10000);
         * 
         * checkacc1.showInfo();
         * savingsacc2.showInfo();
         * 
         * checkacc1.compound();
         * savingsacc2.compound();
         * 
         */

        // Read a Csv file and create a new account based on that data.
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings")){
                accounts.add(new Savings(name, sSn, initDeposit));
            } else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, sSn, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }

        }

        
        for (Account acc : accounts){
            System.out.println("\n***********");
            acc.showInfo();
        }
    }
}
