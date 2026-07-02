public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public double deposit(double amount) {
        return balance = balance + amount;
    }
    public double withdraw(double amount) {
        return balance = balance - amount;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        BankAccount other = (BankAccount) obj;

        return accountNumber == other.accountNumber;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(accountNumber);
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }
}
