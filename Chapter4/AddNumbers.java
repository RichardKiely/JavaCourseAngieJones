package Chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Enter the first number");

            double num1 = input.nextDouble();

            System.out.println("Enter the second number");
            double num2 = input.nextDouble();

            double sum = num1 + num2;

            System.out.println();

            System.out.println("Would you like to start over? ");
            again = input.nextBoolean();

        }while(again);

        input.close();
    }
}
