/*
Noah Kelso
9/21/2020
Lab 2
Exercise 2.21
Write a program that reads in investment amount, annual interest rate, and number of years, and displays
the future investment value
 */
import java.util.Scanner;
public class Kelso_e221 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the investment amount
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = input.nextDouble();
		monthlyInterestRate /= 1200;
		System.out.print("Enter number of years: ");
		int years = input.nextInt();

		// Calculate future investment value
		double futureInvestmentValue = 
			amount * Math.pow(1 + monthlyInterestRate, years * 12);
		
		// Display
		System.out.println("Accumulated value is $" + futureInvestmentValue);
	}
    
}
