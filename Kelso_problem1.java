/*
Noah Kelso
Lab 4
Problem 1
Write a program to calcualte sin, cos, or tan
 */
package Kelso_problem1;
import java.util.Scanner;
import java.lang.Math;
public class Kelso_problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Radian or degree? Type quit to leave: ");
        String choice = in.nextLine();
        while(!choice.equals("quit")){
        if (choice == "degree"){
            System.out.println("Which operation will you use? (sin, cos, tan): ");
            String operation = in.nextLine();
            switch (operation){
                case "sin":
                    System.out.println("Please enter number for sin: ");
                    System.out.println(Math.sin(Math.toRadians(in.nextInt())));
                    break;
                case "cos":
                    System.out.print("Please enter number for  cos: ");
                    System.out.println(Math.cos(Math.toRadians(in.nextInt())));
                    break;
                case "tan":
                    System.out.print("Please enter number for tan: ");
                    System.out.println(Math.tan(Math.toRadians(in.nextInt())));
                    break;
                default:
                    break;
            }
        } else{
            System.out.print("Which operation? (sin, cos, tan):");
            String operation = in.nextLine();
            switch(operation){
                case "sin":
                    System.out.print("Please enter number for sin: ");
                    System.out.println("The sin of the angle is: " +(Math.sin(in.nextInt())));
                    break;
                case "cos":
                    System.out.print("Please enter number for cos: ");
                    System.out.println("The cosine of the angle is: " +(Math.cos(in.nextInt())));
                    break;
                case "tan":
                    System.out.print("Please enter number for tan: ");
                    System.out.println("The tangent of the angle is: " +(Math.tan(in.nextInt())));
                    break;
                default:
                    break;
            }
            }
        }
    }
}