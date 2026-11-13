
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000.0;

        try {
            // Check card reader file
            FileReader card = new FileReader("card.txt");
            card.close();

            System.out.print("Enter account number: ");
            int account = sc.nextInt();

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException(
                    "Amount must be positive"
                );
            }

            if (amount > balance) {
                throw new InsufficientFundsException(
                    "Insufficient balance"
                );
            }

            balance = balance - amount;

            System.out.println("Account Number: " + account);
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: " + balance);

        } catch (FileNotFoundException e) {
            System.out.println("Card reader file not found.");

        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers only.");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount: " + e.getMessage());

        } catch (InsufficientFundsException e) {
            System.out.println("Transaction declined: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("File reading error.");

        } finally {
            System.out.println("ATM transaction process ended.");
            sc.close();
        }
    }
}
