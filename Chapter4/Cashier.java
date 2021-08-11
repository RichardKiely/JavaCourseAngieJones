package Chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of times you would like to scan:");
        int quantity = input.nextInt();

        double total=0;

        for(int i =0; i<quantity;i++){

            System.out.println("Enter the cost of the item:");
            double price = input.nextDouble();

            total += price;
        }

        input.close();

        System.out.println("Your total is €" + total);
    }
}
