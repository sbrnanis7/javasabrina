import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) { // constructor to initialize the balance
        balance = initialBalance;
    }

    public double getBalance() {  // method to check the balance
        return balance;
    }

    public void deposit(double amount) { // method to deposit money
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Your new balance is: RM" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) { // method to withdraw money
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Your new balance is: RM" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Your balance is: RM" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(0); 

        while (true) {
            System.out.println("\n*** AL FONSO DE ALBUQUEQUE BANKING BERHAD ***");
            System.out.println("\nItems:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose option between 1 to 4: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance: RM" + account.getBalance()); //balance
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: RM"); //deposit
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: RM"); //withdraw
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using AFDA banking service."); //exit
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option between 1 to 4");
            }
        }
    }
}
