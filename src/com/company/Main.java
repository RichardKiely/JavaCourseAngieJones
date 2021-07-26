package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        //1Get the number of hours worked
        System.out.println("Please enter the hours of the employee worked");
        int hours = input.nextInt();

        //get the pay rate
        System.out.println("Please enter the hourly pay rate");
        double payRate = input.nextDouble();

        //multiply the hours and pay rate
        double result = hours * payRate;

        //display the result
        System.out.println("The amount you have earned is:  €" + result);


    }
}
