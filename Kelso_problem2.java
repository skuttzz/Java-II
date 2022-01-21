
/*
Noah Kelso
Lab 4
Problem 2
Write a program to determine if an input is a substring of the first
 */
package Kelso_problem1;
import java.util.Scanner;
public class Kelso_problem2 {
    public static void main(String[] args){
        Scanner keyScan = new Scanner(System.in);
            System.out.println("\nEnter str1 or type quit to leave: ");
            String string1 = keyScan.next();
            while(!string1.equals("quit")){
            System.out.println("\nEnter str2: ");
            String string2 = keyScan.next();
        
        
            if(string1.contains(string2)){
            System.out.println(string2 + " is a substring of " +string1+" found at index " +string1.indexOf(string2)+" within "+string1);
            }else
            System.out.println(string2+" is NOT a substring of " +string1);
            }
    }
}