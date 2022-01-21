package lab1;
/*
Noah Kelso
8/27/2020
Lab 1
Exercise 1.9
Create a program that prints the area and perimeter of a rectangle.
 */
public class Kelso_e19 {
    public static void main(String[] args) {
        //Declare Variables set to textbook
        double width = 4.5;
        double height = 7.9;
        
        double perimeter = 2 * (height + width);
        
        double area = width * height;
        //Print results
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
    }
    
}
