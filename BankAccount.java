public class BankAccount {
    double Balance;

    public double UpdateBalance(char oprator , double amount) {
        if (oprator == '+')
            Balance = Balance + amount;
        else if (oprator =='-')
            Balance= Balance- amount;
        else
            System.out.println("please enter right oprator");

        return Balance;
            }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
}
