/*
Noah Kelso
9/21/2020
Lab 2
Exercise 2.23
Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip.
 */
import java.util.Scanner;
public class Kelso_e223 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the distace to drive
		System.out.print("Enter the driving distace: ");
		double distace = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();

		// Compute the cost of driving
		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

		// Display
		System.out.println("The cost of driving is $" + costOfDriving);
	}
    
}
