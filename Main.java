import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your balance:");
        double userBalance = scanner.nextDouble();
        //account.setBalance(userBalance);

        BankAccount account = new BankAccount(0,userBalance);

        System.out.println("enter + to deposit  OR - to withdraw");
        char operator = scanner.next().charAt(0);

        System.out.println("enter the amount:");
        double amount = scanner.nextDouble();

        double result ;

        if (operator == '+')
            result = account.deposit(amount);
        else if (operator =='-')
            result = account.withdraw(amount);
        else
            throw new IllegalArgumentException("Invalid operator");

        System.out.println("your Balance is :" + result);

        BankAccount a1 = new BankAccount(1,300);
        BankAccount a2 = new BankAccount(1,500);

        System.out.println("----equals method Override-----");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
    }
}

//javac Main
//javap -c Main
//java -verbose:class Main
