
import java.util.TreeSet;

public class BankAccountTester {

    /**
     * Tests the bankaccount compare metehod
     * @param args
     */
    public static void main(String args[]){
        BankAccount b1 = new BankAccount(200.50);
        BankAccount b2 = new BankAccount(1);
        BankAccount b3 = new BankAccount(3000.24);
        BankAccount b4 = new BankAccount(79);

        TreeSet<BankAccount> sortedBankAccounts = new TreeSet<>();
        sortedBankAccounts.add(b1);
        sortedBankAccounts.add(b2);
        sortedBankAccounts.add(b3);
        sortedBankAccounts.add(b4);

        for(BankAccount account: sortedBankAccounts)
        {
            System.out.println(account.getBalance());
        }
    }
}
