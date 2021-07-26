package Chapter3;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        double salary;
        double employmentLength;
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your salary");
        salary = input.nextDouble();


        System.out.println("Please enter the length of time you are currently employed");
        employmentLength = input.nextDouble();
        input.close();

        if(salary >= requiredSalary) {

                if (employmentLength >= requiredYearsEmployed) {
                    System.out.println("Congratulations you can get a loan");
                }
                else{

                    System.out.println("Unfortunately you do not qualify at the moment. You have must have " + requiredYearsEmployed + " years to qualify" );
                }
        }
        else{
            System.out.println("Sorry you must earn at least €" + requiredSalary + " to qualify for the loan ");
        }

    }
}
