import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usdToEur = 0.91;
        double usdToInr = 82.5;
        double usdToGbp = 0.79;

        System.out.println("=== Currency Converter ===");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to INR");
        System.out.println("3. USD to GBP");
        System.out.print("Choose your option (1-3): ");

        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.close();
            return;
        }

        System.out.print("Enter amount in USD: ");
        double usdAmount = 0;
        if (scanner.hasNextDouble()) {
            usdAmount = scanner.nextDouble();
        } else {
            System.out.println("Invalid amount.");
            scanner.close();
            return;
        }

        double result;

        switch (choice) {
            case 1:
                result = usdAmount * usdToEur;
                System.out.printf("%.2f USD = %.2f EUR%n", usdAmount, result);
                break;
            case 2:
                result = usdAmount * usdToInr;
                System.out.printf("%.2f USD = %.2f INR%n", usdAmount, result);
                break;
            case 3:
                result = usdAmount * usdToGbp;
                System.out.printf("%.2f USD = %.2f GBP%n", usdAmount, result);
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2 or 3.");
        }

        scanner.close();
    }
}
