/*
Noah Kelso
9/25/2020
Lab 3
Exercise 3.17
Write a program that plays rock, paper, scissors
 */
package lab1;
import java.util.Scanner;
public class Kelso_e317 {
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     //prompt the user for number selection
     System.out.println("please enter 0 for scissor, 1 for rock, and 2 for paper.");
     int guess = input.nextInt();
     
     //generate random number between 3
     int game = (int) (Math.random()*3);
     
     //switch statements for each scenario
     String strGame = "";
     switch(game){
         case 0:
             strGame = "scissor";
             break;
         case 1:
             strGame = "rock";
             break;
         case 2:
             strGame = "paper";
             break;
     }
     String strGuess = "";
     switch (guess){
         case 0:
             strGuess = "scissor";
             break;
         case 1:
             strGuess = "rock";
             break;
         case 2:
             strGuess ="paper";
             break;
         default:
             System.out.println("Not a valid input.");
             System.exit(0);
     }
     System.out.println("The computer is " + strGame + ". You have chosen " + strGuess);
     if (game == guess){
         System.out.println("draw.");
     }
     else if (game - guess == 1 || game - guess == -2) {
         System.out.print("the computer won.");
     }
     else if (game - guess == -1 || game - guess == 2) {
         System.out.print("you have won.");
     }
 }   
}
