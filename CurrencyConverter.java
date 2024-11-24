import
java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class CurrencyConverter {
    private static double balance = 1000.0;
    private static ArrayList<String> transactionHistory = new ArrayList<>();
    private static HashMap<String, Double> currencyRates = new HashMap<>();

    static {
        currencyRates.put("USD", 1.0);
        currencyRates.put("EUR", 0.88);
        currencyRates.put("GBP", 0.76);
        currencyRates.put("JPY", 114.74);
        currencyRates.put("CNY", 6.47);
        currencyRates.put("INR", 74.83);
        currencyRates.put("AUD", 1.31);
        currencyRates.put("CAD", 1.23);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCurrency Converter Menu:");
            System.out.println("1. Convert Currency");
            System.out.println("2. Check Balance");
            System.out.println("3. Transaction History");
            System.out.println("4. Exit");

            try {
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        convertCurrency(scanner);
                        break;
                    case 2:
                        checkBalance();
                        break;
                    case 3:
                        displayTransactionHistory();
                        break;
                    case 4:
                        System.out.println("Exiting... Thank you for using our currency converter!");
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

    private static void convertCurrency(Scanner scanner) {
        System.out.println("Available Currencies:");
        for (String currency : currencyRates.keySet()) {
            System.out.println(currency);
        }

        System.out.print("Enter base currency: ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String targetCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        if (!currencyRates.containsKey(baseCurrency) || !currencyRates.containsKey(targetCurrency)) {
            System.out.println("Error: Invalid currency.");
        } else if (amount <= 0) {
            System.out.println("Error: Amount must be positive.");
        } else {
            double convertedAmount = convertAmount(baseCurrency, targetCurrency, amount);
            transactionHistory.add(amount + " " + baseCurrency + " -> " + String.format("%.2f", convertedAmount) + " " + targetCurrency);
            System.out.println("Conversion Result:");
            System.out.println(amount + " " + baseCurrency + " = " + String.format("%.2f", convertedAmount) + " " + targetCurrency);
            System.out.println("Conversion successful!");
        }
    }

    private static double convertAmount(String baseCurrency, String targetCurrency, double amount) {
        double baseRate = currencyRates.get(baseCurrency);
        double targetRate = currencyRates.get(targetCurrency);
        return amount * targetRate / baseRate;
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
