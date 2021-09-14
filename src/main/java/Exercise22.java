/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ask the user to input three numbers
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();
        //first, check if the numbers are equal or not
        //if two or all of the numbers are equal, terminate the program
        if(num1 == num2 || num2 == num3 || num1 == num3) {
            System.exit(0);
        }
        //if the numbers are different, call the maxVal method to get the biggest number
        else {
            int largestNumber = maxVal(num1, num2, num3);
            //print the biggest number of the three
            System.out.printf("The largest number is %d.%n", largestNumber);
        }
    }
    //creating a method to find the max value of the three numbers
    public static int maxVal(int a, int b, int c) {
        //initialize the max value as integer 'a' to start off
        int max = a;
        //now check to see if integer 'b' is greater than 'a'
        //if so, initialize max as integer 'b'
        if(b > max) {
            max = b;
        }
        //now check to see if integer 'c' is greater than 'a'
        //if so, initialize max as integer 'c'
        if(c > max) {
            max = c;
        }
        //return the max value
        return max;
    }
}
