import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.println("enter your balance:");
        double UserBalance = scanner.nextDouble();
        account.setBalance(UserBalance);

        System.out.println("enter + to deposit  OR - to withdraw");
        char oprator = scanner.next().charAt(0);

        System.out.println("enter the amount:");
        double amount = scanner.nextDouble();

        double result = account.UpdateBalance(oprator, amount);
        System.out.println("your Balance is :" + result);
    }
}

//javac Main
//javap -c Main
//java -verbose:class Main
