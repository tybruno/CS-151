public class BankAccount implements Comparable<BankAccount> {
    private double balance;

    /**
     * BankAccount constructor
     * @param balance of the bank account
     */
    public BankAccount(double balance){

        this.balance = balance;
    }

    /**
     * returns the balance of the bank account
     * @return balance of the bank account
     */
    public double getBalance(){

        return balance;
    }

    /**
     * Compares this objects balance to other bank account balance.
     * @param otherAccount which balance is being compared too.
     * @return the result of the cumparison
     */
    @Override
    public int compareTo(final BankAccount otherAccount){
        return Double.compare(this.balance,otherAccount.balance);
    }

}


