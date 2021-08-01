package Chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week? ");
        Scanner input = new Scanner(System.in);
        double hoursWorked = input.nextDouble();

        //validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid entry/ Your hours must be between 1 and 40. Try again.");
            hoursWorked = input.nextDouble();
        }

        input.close();

        //Calculate the gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: €" + gross);
    }
}
