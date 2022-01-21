/*
Noah Kelso
9/25/2020
Lab 3
Exercise 3.15
Write a program to generate a lottery of a three digit number.
 */
package lab1;

import java.util.Scanner;
public class kelso_e315 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //generate random 3 digit number for lottery
        int lottery = (int)(Math.random()*1000);
        
        //have user enter 3 digit number
        System.out.print("Enter a 3 digit number: ");
        int guess = input.nextInt();
        
        //take digits from random to make lottery
        int lottery1 = lottery / 100;
        int lottery2 = (lottery % 100) / 10;
        int lottery3 = lottery % 10;
        
        // Extract digits from guess
	int guess1 = guess / 100;
        int guess2 = (guess % 100) / 10;
        int guess3 = guess % 10;
        
        //print number
        System.out.println("The number is " + lottery1 + lottery2 + lottery3);
        
        //see if user got number
        if (guess == lottery)
            System.out.println("Correct! Congrats!");
        else if ((guess1 == lottery2 && guess2 == lottery1 && guess3 == lottery3)
                    || (guess1 == lottery2
                    && guess1 == lottery3 && guess3 == lottery1)
                    || (guess1 == lottery3
                    && guess2 == lottery && guess3 == lottery2)
                    || (guess1 == lottery3
                    && guess2 == lottery2 && guess3 == lottery1)
                    || (guess1 == lottery1
                    && guess2 == lottery3 && guess3 == lottery2))
                    System.out.println("Correct! Congrats!");
        else if (guess1 == lottery1 || guess1 == lottery2
                 || guess1 == lottery3 || guess2 == lottery1
                || guess2 == lottery2 || guess2 == lottery3
                || guess3 == lottery1 || guess3 == lottery2
                || guess3 == lottery3)
                 System.out.println("You have matched one number");
                 else
                System.out.println("You have made no matches");
        }
}
