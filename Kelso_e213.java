package Kelso_e27;
/*
Noah Kelso
9/21/2020
Lab 2
Exercise 2.13
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month.
 */
import java.util.Scanner;
public class Kelso_e213 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create a new Scanner object.
		final double MONTHLY_INTEREST_RATE = 0.00417;	// Initialize constant value

		// Prompt the user to enter a monthly saving amount
		System.out.print("Enter the monthly saving amount: ");
		double saving = input.nextDouble();

		// Compute first month account value
		double total = 100 * (1 + MONTHLY_INTEREST_RATE);
		// Compute second month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute third month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute forth month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute fifth month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute sixth month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// Display result
		System.out.println("After the sixth month, the account value is " + total);
	}
    
}
