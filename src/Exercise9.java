/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;

public class Exercise9 {
    static int gallon_size = 350;
    public static void main(String[] args) { //Program to determine number of pizzas per person at pizza party
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the length of ceiling: ");
        int length = scan.nextInt();
        System.out.printf("Enter the width of the ceiling: ");
        int width = scan.nextInt();

        int sqr_feet_of_ceiling = length * width;

        if(sqr_feet_of_ceiling  == 0) {
            System.out.printf("You don't even have a roof");
        }
        else if(sqr_feet_of_ceiling == gallon_size){
            System.out.printf("You will need to purchase 1 gallon of paint for %d square feet", sqr_feet_of_ceiling);
        }
        else{
            System.out.printf("You will need to purchase %d gallon(s) of paint for %d square feet",(sqr_feet_of_ceiling/gallon_size) + 1, sqr_feet_of_ceiling);
        }
    }
}