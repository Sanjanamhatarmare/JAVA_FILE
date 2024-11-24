
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class ATMInterface {
    private static double balance = 1000.0;
    private static ArrayList<String> transactionHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            try {
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        deposit(scanner);
                        break;
                    case 2:
                        withdraw(scanner);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        displayTransactionHistory();
                        break;
                    case 5:
                        System.out.println("Exiting... Thank you for using our banking system!");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    private static void deposit(Scanner scanner) {
        try {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Error: Deposit amount must be positive.");
            } else {
                balance += amount;
                transactionHistory.add("Deposited: $" + String.format("%.2f", amount));
                System.out.println("Deposit successful. New balance: $" + String.format("%.2f", balance));
                System.out.println("Thank you for depositing with us!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount. Please enter a valid number.");
            scanner.next(); // Clear invalid input
        }
    }

    private static void withdraw(Scanner scanner) {
        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Error: Withdrawal amount must be positive.");
            } else if (amount > balance) {
                System.out.println("Error: Insufficient balance.");
            } else {
                balance -= amount;
                transactionHistory.add("Withdrew: $" + String.format("%.2f", amount));
                System.out.println("Withdrawal successful. New balance: $" + String.format("%.2f", balance));
                System.out.println("Thank you for banking with us!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount. Please enter a valid number.");
            scanner.next(); // Clear invalid input
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: $" + String.format("%.2f", balance));
        System.out.println("Your account is up to date.");
    }

    private static void displayTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}

